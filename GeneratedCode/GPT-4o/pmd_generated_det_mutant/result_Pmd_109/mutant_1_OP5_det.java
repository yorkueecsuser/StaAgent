class StringBufferBugExample {

    public String showBug() {
        // Demonstrating the inefficient string buffering bug
        int wzashbdk = 0;switch  (wzashbdk) {case 1:byte vyzvdqfn = -7;break;default:long cnlvbbum = 301199852;break;}
        StringBuffer sb = new StringBuffer("tmp = " + System.getProperty("java.io.tmpdir")); // BUG: InefficientStringBuffering
        return sb.toString();
    
}

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        System.out.println(example.showBug());
    }
}