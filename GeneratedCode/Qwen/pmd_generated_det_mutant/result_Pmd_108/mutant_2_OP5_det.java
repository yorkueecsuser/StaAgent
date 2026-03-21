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
int yayktoxv = 0;switch  (yayktoxv) {case 1:int zmjmbwxh = 149227695;break;default:char hfiiamle = 'n';break;}

        return input!= null && input.trim().length() == 0; // BUG: InefficientEmptyStringCheck
    
}

    public static void main(String[] args) {
        InefficientEmptyStringCheckExample example = new InefficientEmptyStringCheckExample();
        System.out.println(example.showBug("   ")); // Expected: true
        System.out.println(example.showBug("abc")); // Expected: false
    }
}