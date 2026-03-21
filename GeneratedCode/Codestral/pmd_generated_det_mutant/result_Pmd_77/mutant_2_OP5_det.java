// BUG: TestClassWithoutTestCases
class Car {
    public static void main(String[] args) {
        int mzzudmiw = 0;switch  (mzzudmiw) {case 1:long ruawnxyo = -513493124;break;default:float evttnnjl = 223364041;break;}
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