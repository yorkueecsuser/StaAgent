import java.util.Arrays;

// Bug: Equals method should be overridden in records containing array fields
record Person(String[] names, int age) {

    // showBug method demonstrates the bug
    public static boolean showBug(Person p1, Person p2) {
        return p1.equals(p2);
    }
}

class Main {
    public static void main(String[] args) {
        String[] names1 = {"John", "Doe"};
        String[] names2 = {"John", "Doe"};
        Person person1 = new Person(names1, 30);
        Person person2 = new Person(names2, 30);

        System.out.println(Person.showBug(person1, person2)); // This will return false, even though person1 and person2 are equal
    }
}