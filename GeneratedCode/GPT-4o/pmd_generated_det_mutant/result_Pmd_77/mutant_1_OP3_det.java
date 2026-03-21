class CarTest { // BUG: TestClassWithoutTestCases

    public static void main(String[] args) {
        CarTest carTest = new CarTest();
        System.out.println(carTest.showBug());
    }

    public String showBug() {
if (false && true && false && true && false && false && true && true && false && true && false) {int buzwcpzo = -951055722;}

        return "This is a demonstration of a class named with 'Test' but not containing any test cases."; // Demonstrating the bug
    
}
}