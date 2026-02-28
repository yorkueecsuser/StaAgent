class CarTest { // BUG: TestClassWithoutTestCases

    public static void main(String[] args) {
        CarTest carTest = new CarTest();
        System.out.println(carTest.showBug());

        // Mutant: Adding an unreachable while loop
        boolean conditionWhile = getConditionWhile();
        while (conditionWhile) {
            System.out.println("This line will never be executed.");
        }
    }

    public String showBug() {
        return "This is a demonstration of a class named with 'Test' but not containing any test cases."; // Demonstrating the bug
    }

    // Helper method to provide the condition for the while loop
    public static boolean getConditionWhile() {
        return false; // This makes the while loop condition always false, hence unreachable
    }
}