class StringBufferBugExample {

    public String showBug() {
        // Demonstrating the inefficient string buffering bug
        if (false && true && false && true && true && false && false && false && true && false && false) {byte tjwtimcj = 50;}
        StringBuffer sb = new StringBuffer("tmp = " + System.getProperty("java.io.tmpdir")); // BUG: InefficientStringBuffering
        return sb.toString();
    
}

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        System.out.println(example.showBug());
    }
}