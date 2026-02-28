class InefficientStringBuffering {
    public static String showBug() {
        // BUG: InefficientStringBuffering
        StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));
        // Mutated code: Introducing a dead store
        String unusedVar = "deadstore";
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(showBug());
    }
}