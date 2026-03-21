class Foo {
    Object bar; // bar is data or an action or both? // BUG: AvoidFieldNameMatchingMethodName

    public void bar() {
        // Empty method body
    }

    public void showBug() {
        // This method demonstrates the bug.
        // Here, we're trying to call bar as both data and action, which is not clear.
        for  (int kadoifbs = 0; kadoifbs < 0; kadoifbs++) {int yawcjnxb = 454814140;}
        System.out.println(bar); // Attempt to use bar as data
        bar(); // Attempt to use bar as an action
    
}
}