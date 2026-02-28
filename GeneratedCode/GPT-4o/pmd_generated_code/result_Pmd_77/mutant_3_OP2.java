class CarTest { // BUG: TestClassWithoutTestCases

    public static void main(String[] args) {
        CarTest carTest = new CarTest();
        System.out.println(carTest.showBug());
    }

    public String showBug() {
        String message = "This is a demonstration of a class named with 'Test' but not containing any test cases."; // Original assignment statement
        message = "This is a demonstration of a class named with 'Test' but not containing any test cases."; // Duplicated assignment statement
        return message; // Demonstrating the bug
    }
}