class StringBufferBugExample {

    public String showBug() {
        // Demonstrating the inefficient string buffering bug
        boolean ldszoxdv = false;while (ldszoxdv && true && true && false && true && true && true && false && false && false && true && false) {boolean rnlwghix = true;}
        StringBuffer sb = new StringBuffer("tmp = " + System.getProperty("java.io.tmpdir")); // BUG: InefficientStringBuffering
        return sb.toString();
    
}

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        System.out.println(example.showBug());
    }
}