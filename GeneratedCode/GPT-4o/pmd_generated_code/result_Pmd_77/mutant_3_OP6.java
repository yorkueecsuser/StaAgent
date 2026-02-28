class CarTest { // BUG: TestClassWithoutTestCases

    public static void main(String[] args) {
        CarTest carTest = new CarTest();
        System.out.println(carTest.showBug());

        // Inserting unreachable for loop
        boolean conditionFor = getConditionForLoop(); // non-final variable for condition
        for (int i = 0; conditionFor; i++) {
            System.out.println("This will never be printed.");
        }
    }

    public String showBug() {
        return "This is a demonstration of a class named with 'Test' but not containing any test cases."; // Demonstrating the bug
    }

    // Method to provide a dynamically determined condition
    private static boolean getConditionForLoop() {
        return false; // The loop will always be unreachable
    }
}