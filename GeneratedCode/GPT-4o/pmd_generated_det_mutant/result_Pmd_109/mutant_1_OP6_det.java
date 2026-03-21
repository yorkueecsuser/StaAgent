class StringBufferBugExample {

    public String showBug() {
        // Demonstrating the inefficient string buffering bug
        for  (int jsjvjaiz = 0; jsjvjaiz < 0; jsjvjaiz++) {double fujntnjf = -397009992;}
        StringBuffer sb = new StringBuffer("tmp = " + System.getProperty("java.io.tmpdir")); // BUG: InefficientStringBuffering
        return sb.toString();
    
}

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        System.out.println(example.showBug());
    }
}