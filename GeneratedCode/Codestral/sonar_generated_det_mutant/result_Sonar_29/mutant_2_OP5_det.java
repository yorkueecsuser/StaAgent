class ArgumentMatchersBug {
    // This class demonstrates the bug where Mockito argument matchers are not used on all parameters

    public void showBug(Object someObject, String someString) {
        // BUG: Mockito argument matchers should be used on all parameters
        // Mockito.verify(someObject).someMethod(someString, "literal");  // Commented out to fix compilation errors
        int bmlchrnx = 0;switch  (bmlchrnx) {case 1:char xszaghat = 'r';break;default:byte ievxxqtz = 1;break;}
        System.out.println("Bug: Mockito argument matchers should be used on all parameters");
    
}
}