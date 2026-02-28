class CarTest { // BUG: TestClassWithoutTestCases

    public static void main(String[] args) {
        CarTest carTest = new CarTest();
        System.out.println(carTest.showBug());

        // Inserted unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        }
    }

    public String showBug() {
        return "This is a demonstration of a class named with 'Test' but not containing any test cases."; // Demonstrating the bug
    }

    // Method to ensure the condition is always false
    private static boolean getCondition() {
        return false;
    }
}