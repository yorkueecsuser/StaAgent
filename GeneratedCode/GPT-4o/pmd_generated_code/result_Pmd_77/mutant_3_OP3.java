class CarTest { // BUG: TestClassWithoutTestCases

    public static void main(String[] args) {
        CarTest carTest = new CarTest();
        System.out.println(carTest.showBug());

        // Mutation: Unreachable if statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This line is unreachable due to the condition always being false.");
        }
    }

    public String showBug() {
        return "This is a demonstration of a class named with 'Test' but not containing any test cases."; // Demonstrating the bug
    }

    private static boolean getUnreachableCondition() {
        return false; // This method makes the if condition unreachable
    }
}