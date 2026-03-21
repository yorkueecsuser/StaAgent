class StringBufferBugExample {

    public String showBug() {
        // Demonstrating the inefficient string buffering bug
        int jydznrbj = 0;switch  (jydznrbj) {case 1:String hlrscbbb = "erwfzchg";break;default:float cuuezvry = 277460869;break;}
        StringBuffer sb = new StringBuffer("tmp = " + System.getProperty("java.io.tmpdir")); // BUG: InefficientStringBuffering
        return sb.toString();
    
}

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        System.out.println(example.showBug());
    }
}