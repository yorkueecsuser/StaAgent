class InefficientStringBuffering {
    public static String showBug() {
        // BUG: InefficientStringBuffering
        StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));
        // MUTANT: Duplication of the above assignment statement
        StringBuffer sb2 = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(showBug());
    }
}