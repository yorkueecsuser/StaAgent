class CarTest { // BUG: TestClassWithoutTestCases

    public static void main(String[] args) {
        CarTest carTest = new CarTest();
        System.out.println(carTest.showBug());
        
        // Mutant Code
        CarTest a = new CarTest();
        System.out.println(a.showBug());
    }

    public String showBug() {
        return "This is a demonstration of a class named with 'Test' but not containing any test cases."; // Demonstrating the bug
    }
}