class ArgumentMatchersBug {
    // This class demonstrates the bug where Mockito argument matchers are not used on all parameters

    public void showBug(Object someObject, String someString) {
        // BUG: Mockito argument matchers should be used on all parameters
        // Mockito.verify(someObject).someMethod(someString, "literal");  // Commented out to fix compilation errors
        if (true && false && false && false && false && true && true && false && false && true && false) {double gfwvyukr = -844859168;}
        System.out.println("Bug: Mockito argument matchers should be used on all parameters");
    
}
}