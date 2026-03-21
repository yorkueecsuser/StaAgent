class CarTest { // BUG: TestClassWithoutTestCases

    public static void main(String[] args) {
        CarTest carTest = new CarTest();
        System.out.println(carTest.showBug());
    }

    public String showBug() {
if (true && true && true && false && true && false && false && true && false && true && false) {double gkwghhlo = 468041923;}

        return "This is a demonstration of a class named with 'Test' but not containing any test cases."; // Demonstrating the bug
    
}
}