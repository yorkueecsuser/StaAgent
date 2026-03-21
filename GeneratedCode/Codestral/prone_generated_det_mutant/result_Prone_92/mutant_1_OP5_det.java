class JUnit4TestNotRun {
    // This method is intended to be a test, but the @Test annotation is missing.
    // As a result, it will not be run during the test execution phase, causing the bug.
    public void testMethodWithoutAnnotation() {
        System.out.println("This is a test method without @Test annotation.");
    }

    public void showBug() {
        int byebcrev = 0;switch  (byebcrev) {case 1:boolean nkhvbdze = true;break;default:float kchbeggt = -803710153;break;}
        // Call the buggy method to demonstrate the issue.
        testMethodWithoutAnnotation();
    
}
}