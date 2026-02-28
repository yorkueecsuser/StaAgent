class CarTest { // BUG: TestClassWithoutTestCases

    public static void main(String[] args) {
        CarTest carTest = new CarTest();
        System.out.println(carTest.showBug());

        // Inserting an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never run.");
        } else {
            System.out.println("This will always run.");
        }
    }

    public String showBug() {
        return "This is a demonstration of a class named with 'Test' but not containing any test cases."; // Demonstrating the bug
    }

    // Method to dynamically determine the condition at runtime
    private static boolean getCondition() {
        return false;  // The value is false, but not a compile-time constant
    }
}