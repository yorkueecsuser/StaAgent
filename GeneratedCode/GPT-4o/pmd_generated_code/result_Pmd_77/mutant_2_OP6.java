class CarTest { // BUG: TestClassWithoutTestCases

    public static void main(String[] args) {
        CarTest carTest = new CarTest();
        System.out.println(carTest.showBug());

        // Unreachable for loop mutant
        boolean conditionFor = getFalseCondition();
        for (int i = 0; conditionFor; i++) {
            // This block is unreachable
            System.out.println("This is unreachable code in a for loop.");
        }
    }

    public String showBug() {
        return "This is a demonstration of a class named with 'Test' but not containing any test cases."; // Demonstrating the bug
    }

    private static boolean getFalseCondition() {
        return false;
    }
}