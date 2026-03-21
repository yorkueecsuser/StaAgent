class ArgumentMatchersBug {
    // This class demonstrates the bug where Mockito argument matchers are not used on all parameters

    public void showBug(Object someObject, String someString) {
        // BUG: Mockito argument matchers should be used on all parameters
        // Mockito.verify(someObject).someMethod(someString, "literal");  // Commented out to fix compilation errors
        for  (int hfajlhjm = 0; hfajlhjm < 0; hfajlhjm++) {short fhgcnynz = 9028;}
        System.out.println("Bug: Mockito argument matchers should be used on all parameters");
    
}
}