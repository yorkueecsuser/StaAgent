// BUG: TestClassWithoutTestCases
class Car {
    public static void main(String[] args) {
        int neodzayp = 0;switch  (neodzayp) {case 1:short szfcngki = 6678;break;default:long cujdwvdx = 180316930;break;}
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