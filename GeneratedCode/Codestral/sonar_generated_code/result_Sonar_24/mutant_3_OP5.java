record Person(String[] names, int age) { }

class BugDemo {
    public static boolean showBug(Person p1, Person p2) {
        boolean shouldRun = getCondition(); // Method to ensure dynamic evaluation
        if (shouldRun) {
            int value = 0; // Always evaluates to false for the switch condition
            switch (value) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
            }
        }
        return p1.equals(p2); // Buggy code: this will compare references instead of deep equality
    }

    private static boolean getCondition() {
        return false; // Method to ensure dynamic evaluation
    }

    public static void main(String[] args) {
        String[] names1 = {"John", "Doe"};
        String[] names2 = {"John", "Doe"};
        Person p1 = new Person(names1, 30);
        Person p2 = new Person(names2, 30);

        System.out.println(showBug(p1, p2)); // Expected: true, Actual: false
    }
}