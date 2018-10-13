import MuseumGate.GatePOA;
import bean.Person;
import java.util.ArrayList;

/**
 * Created by Rubens Santos Barbosa. CORBA - Museum Control - October 2018
 */
public class GateImplementation extends GatePOA {

    private ArrayList<Person> listMuseumVisitors = new ArrayList<Person>();

    @Override
    public void insertPerson(int person) {
        listMuseumVisitors.add(new Person(person));
    }

    @Override
    public void removePerson(int person) {
        if (listMuseumVisitors.isEmpty()) {
            System.out.println("Cannot remove, no one in Museum");
        } else {
            listMuseumVisitors.remove(listMuseumVisitors.size() - person);
        }
    }

    @Override
    public int updatePeople() {
        int p = 0;

        if (listMuseumVisitors.isEmpty()) {
            return 0;
        }

        for (Person people : listMuseumVisitors) {
            p += people.getPerson();
        }
        return p;
    }

}
