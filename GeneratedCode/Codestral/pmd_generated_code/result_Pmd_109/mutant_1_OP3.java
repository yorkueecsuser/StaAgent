class InefficientStringBuffering {
    public static String showBug() {
        StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));

        // Mutant: Unreachable if statement
        boolean alwaysFalse = getCondition();
        if (alwaysFalse) {
            sb.append(" This code should never be executed.");
        }

        return sb.toString();
    }

    // Method to return a constant false value - this makes the if statement unreachable
    private static boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        System.out.println(showBug());
    }
}