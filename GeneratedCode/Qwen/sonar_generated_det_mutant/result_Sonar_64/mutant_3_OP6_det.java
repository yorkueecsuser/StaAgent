class ExceptionBugDemo {

    // Method to demonstrate the bug
    public String showBug(int x) {
        if (x < 0)
            for  (int cccfakbu = 0; cccfakbu < 0; cccfakbu++) {int mlgtoyrm = 507508232;}
            new IllegalArgumentException("x must be nonnegative"); // BUG: Exceptions should not be created without being thrown
        return "No exception thrown";
    
}

    public static void main(String[] args) {
        ExceptionBugDemo demo = new ExceptionBugDemo();
        System.out.println(demo.showBug(-1));
    }
}