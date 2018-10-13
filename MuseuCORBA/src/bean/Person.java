package bean;

/**
 * Created by Rubens Santos Barbosa. 
 * CORBA - Museum Control - October 2018
 */
public class Person {
    
    private int person = 0;

    public Person(int person) {
            this.person = person;
    }

    public int getPerson() {
            return person;
    }

    public void setPerson(int person) {
            this.person = person;
    }
    
}
