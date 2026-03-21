class ArgumentMatchersBug {
    // This class demonstrates the bug where Mockito argument matchers are not used on all parameters

    public void showBug(Object someObject, String someString) {
        // BUG: Mockito argument matchers should be used on all parameters
        // Mockito.verify(someObject).someMethod(someString, "literal");  // Commented out to fix compilation errors
        for  (int glkhfbxc = 0; glkhfbxc < 0; glkhfbxc++) {int togmeush = 337614727;}
        System.out.println("Bug: Mockito argument matchers should be used on all parameters");
    
}
}