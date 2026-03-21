class StringBufferBugExample {

    public String showBug() {
        // Demonstrating the inefficient string buffering bug
        for  (int aosjvdhr = 0; aosjvdhr < 0; aosjvdhr++) {float wmrnbfrc = 9472613;}
        StringBuffer sb = new StringBuffer("tmp = " + System.getProperty("java.io.tmpdir")); // BUG: InefficientStringBuffering
        return sb.toString();
    
}

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        System.out.println(example.showBug());
    }
}