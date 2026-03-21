class StringBufferBugExample {

    public String showBug() {
        // Demonstrating the inefficient string buffering bug
        if (false && false && true && true && true && true && true && false && true && true && false) {double fwynqwwt = 870766990;}else{byte npoilkik = 124;}
        StringBuffer sb = new StringBuffer("tmp = " + System.getProperty("java.io.tmpdir")); // BUG: InefficientStringBuffering
        return sb.toString();
    
}

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        System.out.println(example.showBug());
    }
}