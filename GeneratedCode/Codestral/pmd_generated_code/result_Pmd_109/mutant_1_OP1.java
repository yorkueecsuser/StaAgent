class InefficientStringBuffering {
    public static String showBug() {
        // BUG: InefficientStringBuffering
        StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));
        String deadStore = "unused_var"; // Dead Store mutant
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(showBug());
    }
}