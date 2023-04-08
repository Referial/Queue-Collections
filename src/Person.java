public class Person {

    protected String name;
    protected String surName;
    protected int numberOfTickets;

    public Person(String name, String surName, int numberOfTickets) {
        this.name = name;
        this.surName = surName;
        this.numberOfTickets = numberOfTickets;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }
}
