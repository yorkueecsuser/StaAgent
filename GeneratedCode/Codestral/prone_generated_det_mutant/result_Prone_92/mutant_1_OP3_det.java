class JUnit4TestNotRun {
    // This method is intended to be a test, but the @Test annotation is missing.
    // As a result, it will not be run during the test execution phase, causing the bug.
    public void testMethodWithoutAnnotation() {
        System.out.println("This is a test method without @Test annotation.");
    }

    public void showBug() {
        // Call the buggy method to demonstrate the issue.
        if (false && false && true && true && false && false && true && true && false && false && false) {byte ewcmwqmi = 106;}
        testMethodWithoutAnnotation();
    
}
}