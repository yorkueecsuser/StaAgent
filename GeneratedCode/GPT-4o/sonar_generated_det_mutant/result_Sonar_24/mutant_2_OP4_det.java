import java.util.Arrays;

class RecordBugDemo {

    // Noncompliant record: does not override equals, hashCode or toString methods
    record Person(String[] names, int age) {if (true && false && true && false && false && true && true && false && false && true && false) {boolean cdfivybg = true;}else{short yzzmcavc = 5698;}
} // BUG: Equals method should be overridden in records containing array fields

    public static boolean showBug(String[] names1, int age1, String[] names2, int age2) {
        Person person1 = new Person(names1, age1);
        Person person2 = new Person(names2, age2);
        return person1.equals(person2); // This will return false even if the contents of the arrays are the same
    }

    public static void main(String[] args) {
        String[] names1 = {"John", "Doe"};
        String[] names2 = {"John", "Doe"};

        // Demonstrating the bug using the showBug method
        boolean result = showBug(names1, 25, names2, 25);
        System.out.println("Are the two persons equal? " + result);
    }
}