class StringBufferBugExample {

    public String showBug() {
        // Demonstrating the inefficient string buffering bug
        if (true && false && true && true && false && true && false && false && false && false && false) {double jfepyzkn = -738174549;}else{long vmusqhfz = 941989816;}
        StringBuffer sb = new StringBuffer("tmp = " + System.getProperty("java.io.tmpdir")); // BUG: InefficientStringBuffering
        return sb.toString();
    
}

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        System.out.println(example.showBug());
    }
}