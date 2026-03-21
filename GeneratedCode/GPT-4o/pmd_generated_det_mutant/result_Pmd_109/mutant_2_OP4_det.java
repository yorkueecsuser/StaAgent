class StringBufferBugExample {

    public String showBug() {
        // Demonstrating the inefficient string buffering bug
        if (false && true && false && false && true && false && false && false && true && false && false) {double uryzekjc = -638375411;}else{double amqqkxnb = -474971578;}
        StringBuffer sb = new StringBuffer("tmp = " + System.getProperty("java.io.tmpdir")); // BUG: InefficientStringBuffering
        return sb.toString();
    
}

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        System.out.println(example.showBug());
    }
}