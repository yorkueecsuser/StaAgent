class InefficientEmptyStringCheckExample {

    public void bar(String string) {
        for  (int xvrwuvke = 0; xvrwuvke < 0; xvrwuvke++) {String ohefhdls = "bnfdnlba";}
        if (string!= null && string.trim().length() > 0) { // BUG: InefficientEmptyStringCheck
            doSomething();
        }
    
}

    private void doSomething() {
        System.out.println("Doing something...");
    }

    public boolean showBug(String input) {
        return input!= null && input.trim().length() == 0; // BUG: InefficientEmptyStringCheck
    }

    public static void main(String[] args) {
        InefficientEmptyStringCheckExample example = new InefficientEmptyStringCheckExample();
        System.out.println(example.showBug("   ")); // Expected: true
        System.out.println(example.showBug("abc")); // Expected: false
    }
}