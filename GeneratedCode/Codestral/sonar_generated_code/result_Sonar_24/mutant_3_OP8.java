record Person(String[] names, int age) { }

class BugDemo {
    public static boolean showBug(Person p1, Person p2) {
        return p1.equals(p2); // Buggy code: this will compare references instead of deep equality
    }

    public static void main(String[] args) {
        String[] a = {"John", "Doe"}; // Variable renamed from names1 to a
        String[] names2 = {"John", "Doe"};
        Person p1 = new Person(a, 30); // Variable a used here
        Person p2 = new Person(names2, 30);

        System.out.println(showBug(p1, p2)); // Expected: true, Actual: false
    }
}