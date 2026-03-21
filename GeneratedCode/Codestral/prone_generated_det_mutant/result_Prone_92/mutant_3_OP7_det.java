class JUnit4TestNotRun {
    // This method is intended to be a test, but the @Test annotation is missing.
    // As a result, it will not be run during the test execution phase, causing the bug.
    public void testMethodWithoutAnnotation() {
        System.out.println("This is a test method without @Test annotation.");
    }

    public void showBug() {
        boolean lkmasoia = false;while (lkmasoia && true && false && true && false && true && false && true && true && false && false && false) {short ohecmxeb = -934;}
        // Call the buggy method to demonstrate the issue.
        testMethodWithoutAnnotation();
    
}
}