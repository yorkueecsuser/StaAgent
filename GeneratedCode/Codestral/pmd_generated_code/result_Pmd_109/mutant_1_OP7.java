class InefficientStringBuffering {
    public static String showBug() {
        // BUG: InefficientStringBuffering
        StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));
        while (isFalseCondition()) { // Unreachable while loop
            System.out.println("This line should never execute.");
        }
        return sb.toString();
    }

    private static boolean isFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        System.out.println(showBug());
    }
}