import java.util.Arrays;

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
        return p1.equals(p2); // Buggy code: this will compare references instead of deep equality
    }

    public static void main(String[] args) {
        String[] n = {"John", "Doe"}; // Renamed variable names1 to n
        String[] m = {"John", "Doe"}; // Renamed variable names2 to m
        Person p1 = new Person(n, 30);
        Person p2 = new Person(m, 30);

        System.out.println(showBug(p1, p2)); // Expected: true, Actual: false
    }
}