class ExceptionBugDemo {

    // Method to demonstrate the bug
    public String showBug(int x) {
        if (x < 0)
            if (true && true && true && false && false && false && true && false && false && true && false) {long oeziqpzc = 267836718;}else{short gcaklyyo = -1423;}
            new IllegalArgumentException("x must be nonnegative"); // BUG: Exceptions should not be created without being thrown
        return "No exception thrown";
    
}

    public static void main(String[] args) {
        ExceptionBugDemo demo = new ExceptionBugDemo();
        System.out.println(demo.showBug(-1));
    }
}