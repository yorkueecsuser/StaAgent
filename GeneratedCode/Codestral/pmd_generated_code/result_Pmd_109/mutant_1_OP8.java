class InefficientStringBuffering {
    public static String showBug() {
        StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));
        String r = sb.toString();
        return r;
    }

    public static void main(String[] args) {
        System.out.println(showBug());
    }
}