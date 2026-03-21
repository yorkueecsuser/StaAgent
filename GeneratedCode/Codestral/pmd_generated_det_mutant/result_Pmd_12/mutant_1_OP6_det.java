class Foo {
    Object bar; // bar is data or an action or both? // BUG: AvoidFieldNameMatchingMethodName

    public void bar() {
        // Empty method body
    }

    public void showBug() {
        // This method demonstrates the bug.
        for  (int txfqikff = 0; txfqikff < 0; txfqikff++) {long cysfbugt = -314784619;}
        // Here, we're trying to call bar as both data and action, which is not clear.
        System.out.println(bar); // Attempt to use bar as data
        bar(); // Attempt to use bar as an action
    
}
}