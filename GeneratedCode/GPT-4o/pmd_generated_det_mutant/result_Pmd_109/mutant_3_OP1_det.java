class StringBufferBugExample {

    public String showBug() {
        // Demonstrating the inefficient string buffering bug
        short bjtimdsz = 4249;
        StringBuffer sb = new StringBuffer("tmp = " + System.getProperty("java.io.tmpdir")); // BUG: InefficientStringBuffering
        return sb.toString();
    
}

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        System.out.println(example.showBug());
    }
}