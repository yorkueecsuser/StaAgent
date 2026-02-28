class CarTest { // BUG: TestClassWithoutTestCases

    public static void main(String[] args) {
        CarTest carTest = new CarTest();
        System.out.println(carTest.showBug());
        
        // Unreachable for loop mutant
        boolean unreachableCondition = getCondition();
        for (int i = 0; unreachableCondition; i++) {
            System.out.println("This code is unreachable.");
        }
    }

    public String showBug() {
        return "This is a demonstration of a class named with 'Test' but not containing any test cases."; // Demonstrating the bug
    }

    // Helper method to ensure the for loop condition is dynamic and unreachable
    public static boolean getCondition() {
        return false;
    }
}