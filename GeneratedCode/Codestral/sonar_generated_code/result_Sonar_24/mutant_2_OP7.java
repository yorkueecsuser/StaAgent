// BUG: Equals method should be overridden in records containing array fields
record Person(String[] names, int age) { }

class BugDemo {
    public static boolean showBug(Person p1, Person p2) {
        // Inserting unreachable while loop
        while (getCondition()) {
            // This code will never be executed
        }
        return p1.equals(p2); // Buggy code: this will compare references instead of deep equality
    }

    public static boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        String[] names1 = {"John", "Doe"};
        String[] names2 = {"John", "Doe"};
        Person p1 = new Person(names1, 30);
        Person p2 = new Person(names2, 30);

        System.out.println(showBug(p1, p2)); // Expected: true, Actual: false
    }
}