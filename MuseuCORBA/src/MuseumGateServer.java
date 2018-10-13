import java.util.Properties;
import javax.swing.JOptionPane;
import org.omg.CORBA.ORB;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContext;
import org.omg.CosNaming.NamingContextHelper;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

/**
 * Created by Rubens Santos Barbosa. CORBA - Museum Control - October 2018
 */
public class MuseumGateServer {

    public static void main(String args[]) {

        String inputNameServerIP = null;
        String nameServerIP = null;
        String inputNameServerPort = null;
        String nameServerPort = null;

        // Pegando o endereço IP do Servidor de Nomes
        inputNameServerIP = JOptionPane.showInputDialog("Digite o endereço IP do Servidor de Nomes");
        if (inputNameServerIP == null) {
            System.exit(0);
        } else if (inputNameServerIP.equals("localhost") || inputNameServerIP.matches("\\d{1,3}.\\d{1,3}.\\d{1,3}.\\d{1,3}")) {
            nameServerIP = inputNameServerIP;
        } else {
            JOptionPane.showMessageDialog(null, "Endereço inválido");
            System.exit(0);
        }

        // Pegando a porta do Servidor de Nomes
        inputNameServerPort = JOptionPane.showInputDialog("Digite a porta do Servidor de Nomes");
        if (inputNameServerPort == null) {
            System.exit(0);
        } else if (inputNameServerPort.matches("\\d{1,6}")) {
            nameServerPort = inputNameServerPort;
        } else {
            JOptionPane.showMessageDialog(null, "Porta inválida");
            System.exit(0);
        }

        Properties prop = new Properties();
        if (!(nameServerIP == null) && !(nameServerPort == null)) {

            prop.put("org.omg.CORBA.ORBInitialHost", nameServerIP);
            prop.put("org.omg.CORBA.ORBInitialPort", nameServerPort);
        }

        try {

            ORB orb = ORB.init(args, prop);

            org.omg.CORBA.Object rootPOAReference = orb.resolve_initial_references("RootPOA");
            POA rootPOA = POAHelper.narrow(rootPOAReference);

            org.omg.CORBA.Object nameServiceReference = orb.resolve_initial_references("NameService");
            NamingContext naming = NamingContextHelper.narrow(nameServiceReference);
            
            GateImplementation gate = new GateImplementation();
            org.omg.CORBA.Object gateReference = rootPOA.servant_to_reference(gate);

            NameComponent[] gateName = {new NameComponent("Gate", "")};

            naming.rebind(gateName, gateReference);

            rootPOA.the_POAManager().activate();

            System.out.println("Server Gate Ready...");

            orb.run();

        } catch (Exception ex) {
            System.out.println("Error");
            ex.printStackTrace();
        }

    }

}
