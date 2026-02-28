class InefficientStringBuffering {
    public static String showBug() {
        StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));
        // Added mutant code
        StringBuffer sb_mutant = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(showBug());
    }
}