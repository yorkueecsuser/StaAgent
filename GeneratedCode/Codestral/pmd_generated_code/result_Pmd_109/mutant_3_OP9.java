class InefficientStringBuffering {
    public static String showBug() {
        // MUTATED: Introduce InefficientStringBuffering
        StringBuffer sb = new StringBuffer("tmp = ");
        sb.append(System.getProperty("java.io.tmpdir"));
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(showBug());
    }
}