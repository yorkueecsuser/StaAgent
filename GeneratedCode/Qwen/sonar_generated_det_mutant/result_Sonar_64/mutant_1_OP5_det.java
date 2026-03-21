class ExceptionBugDemo {

    // Method to demonstrate the bug
    public String showBug(int x) {
        int vpzbubtr = 0;switch  (vpzbubtr) {case 1:byte eaidujtg = -67;break;default:long undpkcbi = -380881103;break;}
        if (x < 0)
            new IllegalArgumentException("x must be nonnegative"); // BUG: Exceptions should not be created without being thrown
        return "No exception thrown";
    
}

    public static void main(String[] args) {
        ExceptionBugDemo demo = new ExceptionBugDemo();
        System.out.println(demo.showBug(-1));
    }
}