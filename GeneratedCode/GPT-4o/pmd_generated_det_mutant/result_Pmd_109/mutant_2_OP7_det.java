class StringBufferBugExample {

    public String showBug() {
        // Demonstrating the inefficient string buffering bug
        boolean grjwncfu = false;while (grjwncfu && true && true && true && false && true && true && false && false && false && false && false) {long kytnuork = 113363210;}
        StringBuffer sb = new StringBuffer("tmp = " + System.getProperty("java.io.tmpdir")); // BUG: InefficientStringBuffering
        return sb.toString();
    
}

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        System.out.println(example.showBug());
    }
}