record Person(String[] names, int age) { }

class BugDemo {
    public static boolean showBug(Person p1, Person p2) {
        boolean isEqual = p1.equals(p2); // Original code

        // Inserting unreachable if statement using a dynamically determined condition
        boolean unreachableCondition = getCondition();
        if (unreachableCondition) {
            System.out.println("This block is unreachable");
        }

        return isEqual;
    }

    // A sample method to dynamically generate a condition
    private static boolean getCondition() {
        return false;  // This condition is always false to make the block unreachable
    }

    public static void main(String[] args) {
        String[] names1 = {"John", "Doe"};
        String[] names2 = {"John", "Doe"};
        Person p1 = new Person(names1, 30);
        Person p2 = new Person(names2, 30);

        System.out.println(showBug(p1, p2)); // Expected: true, Actual: false
    }
}