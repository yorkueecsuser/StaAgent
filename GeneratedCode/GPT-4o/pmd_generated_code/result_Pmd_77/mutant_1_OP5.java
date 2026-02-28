class CarTest { // BUG: TestClassWithoutTestCases

    public static void main(String[] args) {
        CarTest carTest = new CarTest();
        System.out.println(carTest.showBug());

        // Unreachable switch statement mutant
        int unreachableCondition = getUnreachableCondition(); // Non-final variable used
        switch (unreachableCondition) {
            case 99: // Arbitrary case that will never be reached
                System.out.println("This is an unreachable switch case.");
                break;
            default:
                break;
        }
    }

    public String showBug() {
        return "This is a demonstration of a class named with 'Test' but not containing any test cases."; // Demonstrating the bug
    }

    // Method to dynamically determine the condition at runtime
    private static int getUnreachableCondition() {
        return -1; // Ensures switch case 99 is never reached
    }
}