record Person(String[] names, int age) { }

class BugDemo {
    public static boolean showBug(Person p1, Person p2) {
        // Adding unreachable if-else statement
        if (isUnreachableCondition()) {
            // Unreachable code
            System.out.println("This code should never be executed.");
        } else {
            // Original code
            return p1.equals(p2);
        }
    }

    // Method to return an always false condition
    private static boolean isUnreachableCondition() {
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