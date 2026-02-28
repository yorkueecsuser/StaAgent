import java.util.Arrays;

// BUG: Equals method should be overridden in records containing array fields
record Person(String[] names, int age) {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!= o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Arrays.equals(names, person.names);
    }
}

class BugDemo {
    public static boolean showBug(Person p1, Person p2) {
        int unusedVariable; // Dead Store: Inserting an unused variable declaration
        return p1.equals(p2);
    }

    public static void main(String[] args) {
        String[] names1 = {"John", "Doe"};
        String[] names2 = {"John", "Doe"};
        Person p1 = new Person(names1, 30);
        Person p2 = new Person(names2, 30);

        System.out.println(showBug(p1, p2)); // Expected: true, Actual: true
    }
}