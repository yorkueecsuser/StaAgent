class StringBufferBugExample {

    public String showBug() {
        // Demonstrating the inefficient string buffering bug
        int kqaswwng = 0;switch  (kqaswwng) {case 1:String jrhfujzm = "qtdxayon";break;default:String zjulbntl = "ejizyvgy";break;}
        StringBuffer sb = new StringBuffer("tmp = " + System.getProperty("java.io.tmpdir")); // BUG: InefficientStringBuffering
        return sb.toString();
    
}

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        System.out.println(example.showBug());
    }
}