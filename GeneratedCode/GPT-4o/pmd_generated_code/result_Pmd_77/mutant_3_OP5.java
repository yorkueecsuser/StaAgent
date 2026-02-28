class CarTest { // BUG: TestClassWithoutTestCases

    public static void main(String[] args) {
        CarTest carTest = new CarTest();
        System.out.println(carTest.showBug());
        
        // Beginning of the unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 999: // This case will never be true
                System.out.println("This will never be printed.");
                break;
            default:
                // Do nothing
                break;
        }
        // End of the unreachable switch statement
    }

    public String showBug() {
        return "This is a demonstration of a class named with 'Test' but not containing any test cases."; // Demonstrating the bug
    }
    
    // This method provides a value that ensures the switch is unreachable
    static int getUnreachableValue() {
        return 0;
    }
}