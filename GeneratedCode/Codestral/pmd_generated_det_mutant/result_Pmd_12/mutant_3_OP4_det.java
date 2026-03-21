class Foo {
    Object bar; // bar is data or an action or both? // BUG: AvoidFieldNameMatchingMethodName

    public void bar() {
        // Empty method body
    }

    public void showBug() {
        // This method demonstrates the bug.
        // Here, we're trying to call bar as both data and action, which is not clear.
        if (true && true && false && false && false && true && false && true && false && false && false) {int nccybzme = 101804207;}else{long pypxqatl = -189915633;}
        System.out.println(bar); // Attempt to use bar as data
        bar(); // Attempt to use bar as an action
    
}
}