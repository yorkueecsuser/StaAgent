// BUG: Equals method should be overridden in records containing array fields
record Person(String[] names, int age) { }

class BugDemo {
    public static boolean showBug(Person p1, Person p2) {
        return p1.equals(p2); // Buggy code: this will compare references instead of deep equality
    }

    public static void main(String[] args) {
        String[] names1 = {"John", "Doe"};
        String[] names2 = {"John", "Doe"};
        Person p1 = new Person(names1, 30);
        Person r = new Person(names2, 30); // Mutated code: renamed p2 to r

        System.out.println(showBug(p1, r)); // Expected: true, Actual: false
    }
}