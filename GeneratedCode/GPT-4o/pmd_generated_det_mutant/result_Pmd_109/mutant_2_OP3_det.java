class StringBufferBugExample {

    public String showBug() {
        // Demonstrating the inefficient string buffering bug
        if (true && true && true && true && false && false && false && false && true && false && false) {short edxsmlee = 3870;}
        StringBuffer sb = new StringBuffer("tmp = " + System.getProperty("java.io.tmpdir")); // BUG: InefficientStringBuffering
        return sb.toString();
    
}

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        System.out.println(example.showBug());
    }
}