import MuseumGuard.GuardPOA;

/**
 * Created by Rubens Santos Barbosa. CORBA - Museum Control - October 2018
 */
public class GuardImplementation extends GuardPOA {

    @Override
    public boolean changeDayPeriod(boolean day) {
        return day;
    }

    @Override
    public int getAmountVisitor(int visitor) {
        return visitor;
    }
    
}
