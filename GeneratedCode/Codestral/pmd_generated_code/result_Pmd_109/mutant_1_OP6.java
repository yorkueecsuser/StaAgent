class InefficientStringBuffering {
    private static boolean getCondition() {
        return false;
    }

    public static String showBug() {
        // Original code
        StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));

        // Added mutant code
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            System.out.println("This loop is unreachable.");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(showBug());
    }
}