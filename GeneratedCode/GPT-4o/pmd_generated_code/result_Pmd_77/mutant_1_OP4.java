class CarTest { // BUG: TestClassWithoutTestCases

    public static void main(String[] args) {
        CarTest carTest = new CarTest();
        System.out.println(carTest.showBug());

        // Mutant: Unreachable if-else statement
        boolean condition = getCondition(); // Using a method to determine the condition
        if (condition) { 
            System.out.println("This block is unreachable");
        } else {
            System.out.println("This block is always executed");
        }
    }

    public String showBug() {
        return "This is a demonstration of a class named with 'Test' but not containing any test cases."; // Demonstrating the bug
    }

    // This method returns false making the if condition unreachable
    public static boolean getCondition() {
        return false;
    }
}