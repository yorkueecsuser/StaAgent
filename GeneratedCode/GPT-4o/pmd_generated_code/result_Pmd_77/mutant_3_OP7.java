class CarTest { // BUG: TestClassWithoutTestCases

    public static void main(String[] args) {
        CarTest carTest = new CarTest();
        System.out.println(carTest.showBug());
        
        // Introduce an unreachable while loop
        boolean conditionWhile = getCondition(); // This method returns false
        while (conditionWhile) {
            System.out.println("This is unreachable code.");
        }
    }

    public String showBug() {
        return "This is a demonstration of a class named with 'Test' but not containing any test cases."; // Demonstrating the bug
    }
    
    // Method to provide a non-final condition for the while loop
    private static boolean getCondition() {
        return false; // Ensures the while loop is never entered
    }
}