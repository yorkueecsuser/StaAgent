class CarTest { // BUG: TestClassWithoutTestCases

    public static void main(String[] args) {
        CarTest carTest = new CarTest();
        System.out.println(carTest.showBug());
        
        // Duplicate the assignment statement
        String message = carTest.showBug(); // Original assignment statement
        String duplicateMessage = carTest.showBug(); // Duplicated assignment statement
    }

    public String showBug() {
        return "This is a demonstration of a class named with 'Test' but not containing any test cases."; // Demonstrating the bug
    }
}