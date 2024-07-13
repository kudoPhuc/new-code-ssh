package list;

public class test {
    public static void main(String[] args) {
        Person p = new Person("Phuc", "Cao Lanh");
        Person p1 = new Person("Phuc", "Cao Lanh");
        Person p2 = new Person("Phuc", "Cao Lanh");
        p.setNext(p1);
        p1.setNext(p2);
        Person dau = p;
        while (true) {
            System.out.println(dau);
            dau = dau.getNext();
            if (dau == null)
                break;
        }
    }
}
