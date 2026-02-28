record Person(String[] names, int age) { }

class BugDemo {
    public static boolean showBug(Person p1, Person p2) {
        boolean shouldCompare = false;
        if (shouldCompare) { // Mutant: Unreachable if statement
            return p1.equals(p2);
        }
        return!p1.equals(p2); // Actual bug fix
    }

    public static void main(String[] args) {
        String[] names1 = {"John", "Doe"};
        String[] names2 = {"John", "Doe"};
        Person p1 = new Person(names1, 30);
        Person p2 = new Person(names2, 30);

        System.out.println(showBug(p1, p2)); // Expected: true, Actual: false
    }
}