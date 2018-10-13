import MuseumBell.BellPOA;

/**
 * Created by Rubens Santos Barbosa. CORBA - Museum Control - October 2018
 */
public class BellImplementation extends BellPOA {

    @Override
    public boolean ringBell(boolean day, int visitor) {
        if (day == false && visitor != 0) {
            return true;
        } else {
            return false;
        }    
    }

}
