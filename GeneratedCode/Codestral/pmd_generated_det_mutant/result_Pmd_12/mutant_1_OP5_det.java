class Foo {
    Object bar; // bar is data or an action or both? // BUG: AvoidFieldNameMatchingMethodName

    public void bar() {
        // Empty method body
    }

    public void showBug() {
        // This method demonstrates the bug.
        int wimazvtf = 0;switch  (wimazvtf) {case 1:String vegucowc = "jprlzqoa";break;default:String uhezcfgf = "pgzdfsfd";break;}
        // Here, we're trying to call bar as both data and action, which is not clear.
        System.out.println(bar); // Attempt to use bar as data
        bar(); // Attempt to use bar as an action
    
}
}