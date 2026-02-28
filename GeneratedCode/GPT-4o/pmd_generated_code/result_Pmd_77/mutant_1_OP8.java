class CarTest { // BUG: TestClassWithoutTestCases

    public static void main(String[] args) {
        CarTest carTest = new CarTest();
        System.out.println(carTest.showBug());
    }

    public String showBug() {
        return "This is a demonstration of a class named with 'Test' but not containing any test cases."; // Demonstrating the bug
    }
}

// Mutant: Renaming user-defined variable
class CarTestMutant { // BUG: TestClassWithoutTestCases

    public static void main(String[] args) {
        CarTestMutant b = new CarTestMutant(); // Renamed carTest to b
        System.out.println(b.showBug());
    }

    public String showBug() {
        return "This is a demonstration of a class named with 'Test' but not containing any test cases."; // Demonstrating the bug
    }
}