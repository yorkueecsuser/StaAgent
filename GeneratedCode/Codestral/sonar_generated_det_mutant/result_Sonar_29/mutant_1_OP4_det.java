class ArgumentMatchersBug {
    // This class demonstrates the bug where Mockito argument matchers are not used on all parameters

    public void showBug(Object someObject, String someString) {
        // BUG: Mockito argument matchers should be used on all parameters
        // Mockito.verify(someObject).someMethod(someString, "literal");  // Commented out to fix compilation errors
        if (false && true && false && true && true && false && true && false && false && true && false) {long goagzhwn = 407575018;}else{float fcvkvsxy = -439126397;}
        System.out.println("Bug: Mockito argument matchers should be used on all parameters");
    
}
}