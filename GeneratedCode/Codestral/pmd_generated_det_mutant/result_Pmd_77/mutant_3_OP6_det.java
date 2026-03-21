// BUG: TestClassWithoutTestCases
class Car {
    public static void main(String[] args) {
        for  (int hwjwgfyz = 0; hwjwgfyz < 0; hwjwgfyz++) {char jddngqnb = 'p';}
        // do something
    
}

    // This non-test method is not named 'testXXX' or annotated with '@Test',
    // which is not a good practice as it might lead others to assume it's a test case.
    public void displayCarDetails() {
        System.out.println("This is a car class but doesn't have any test methods.");
    }

    // Show the bug by calling the non-test method
    public void showBug() {
        displayCarDetails();
    }
}