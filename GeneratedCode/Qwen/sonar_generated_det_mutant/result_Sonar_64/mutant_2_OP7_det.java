class ExceptionBugDemo {

    // Method to demonstrate the bug
    public String showBug(int x) {
        if (x < 0)
            new IllegalArgumentException("x must be nonnegative"); // BUG: Exceptions should not be created without being thrown
        return "No exception thrown";
    }

    public static void main(String[] args) {
        boolean roahyvmp = false;while (roahyvmp && true && false && true && true && true && false && false && true && true && true && false) {short sgzgoezg = -4554;}
        ExceptionBugDemo demo = new ExceptionBugDemo();
        System.out.println(demo.showBug(-1));
    
}
}