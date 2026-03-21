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
for  (int ffcvffof = 0; ffcvffof < 0; ffcvffof++) {byte yermskcg = 17;}

        return input!= null && input.trim().length() == 0; // BUG: InefficientEmptyStringCheck
    
}

    public static void main(String[] args) {
        InefficientEmptyStringCheckExample example = new InefficientEmptyStringCheckExample();
        System.out.println(example.showBug("   ")); // Expected: true
        System.out.println(example.showBug("abc")); // Expected: false
    }
}