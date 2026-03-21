class ExceptionBugDemo {

    // Method to demonstrate the bug
    public String showBug(int x) {
        int uhixklch = 0;switch  (uhixklch) {case 1:long xbnjqnum = 294846283;break;default:float jojftbep = -632375499;break;}
        if (x < 0)
            new IllegalArgumentException("x must be nonnegative"); // BUG: Exceptions should not be created without being thrown
        return "No exception thrown";
    
}

    public static void main(String[] args) {
        ExceptionBugDemo demo = new ExceptionBugDemo();
        System.out.println(demo.showBug(-1));
    }
}