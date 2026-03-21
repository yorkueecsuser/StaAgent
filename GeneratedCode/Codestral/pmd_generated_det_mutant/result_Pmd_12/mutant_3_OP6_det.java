class Foo {
    Object bar; // bar is data or an action or both? // BUG: AvoidFieldNameMatchingMethodName

    public void bar() {
        // Empty method body
    }

    public void showBug() {
        // This method demonstrates the bug.
        // Here, we're trying to call bar as both data and action, which is not clear.
        System.out.println(bar); // Attempt to use bar as data
        for  (int fwirhwvx = 0; fwirhwvx < 0; fwirhwvx++) {double kkkvzgjn = -321041349;}
        bar(); // Attempt to use bar as an action
    
}
}