package homeWork.homeWork2;

public class Main {
    public static void main(String[] args) {
        Person personIvan = new Person(true, "Ivan");
        Person personMary = new Person(false, "Mary");

        Person personPavel = new Person(true, "Pavel");
        Person personNatalia = new Person(false, "Natalia");
        Person personEgor = new Person(true, "Egor");

        System.out.println("*1*");
        personIvan.marry(personMary);
        System.out.println("*2*");
        personPavel.marry(personEgor);
        System.out.println("*3*");
        personIvan.marry(personMary);
        System.out.println("*4*");
        personMary.marry(personIvan);
        System.out.println("*5*");
        personNatalia.marry(personIvan);
        System.out.println("*6*");
        personMary.marry(personEgor);
        System.out.println("*7*");
        personMary.marry(personIvan);
        System.out.println("*7*");
        personEgor.marry(personNatalia);
    }
}
