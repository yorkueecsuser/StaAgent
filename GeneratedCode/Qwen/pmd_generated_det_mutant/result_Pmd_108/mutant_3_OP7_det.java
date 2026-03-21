class InefficientEmptyStringCheckExample {

    public void bar(String string) {
        boolean czakluen = false;while (czakluen && true && false && true && true && false && false && false && false && false && true && false) {int qbizgnkd = 880924282;}
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