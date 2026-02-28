class CarTest { // BUG: TestClassWithoutTestCases

    public static void main(String[] args) {
        CarTest carTest = new CarTest();
        System.out.println(carTest.showBug());

        // Mutant: Adding an unreachable switch statement
        int unreachableValue = getUnreachableValue(); // This method always returns a value that doesn't match any case
        switch (unreachableValue) {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            default:
                break; // This is reachable due to default but other cases are not.
        }
    }

    public String showBug() {
        return "This is a demonstration of a class named with 'Test' but not containing any test cases."; // Demonstrating the bug
    }

    // Helper method to ensure the switch statement remains unreachable
    private static int getUnreachableValue() {
        return 0; // Always returns 0, which matches no case
    }
}