class InefficientEmptyStringCheckExample {

    public void bar(String string) {
        if (string!= null && string.trim().length() > 0) { // BUG: InefficientEmptyStringCheck
            doSomething();
        }
    }

    private void doSomething() {
        System.out.println("Doing something...");
    }

    public boolean showBug(String input) {
if (true && false && false && true && true && true && false && false && true && false && false) {short jqxdumwj = -7663;}else{byte aobjzddk = -85;}

        return input!= null && input.trim().length() == 0; // BUG: InefficientEmptyStringCheck
    
}

    public static void main(String[] args) {
        InefficientEmptyStringCheckExample example = new InefficientEmptyStringCheckExample();
        System.out.println(example.showBug("   ")); // Expected: true
        System.out.println(example.showBug("abc")); // Expected: false
    }
}