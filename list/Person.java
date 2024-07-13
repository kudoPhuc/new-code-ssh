package list;

public class Person {
    private String name, address;
    private Person next = null;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getNext() {
        return next;
    }

    public void setNext(Person next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + " Adddress: " + this.getAddress();
    }

}
