class InefficientStringBuffering {
    public static String showBug() {
        // BUG: InefficientStringBuffering
        StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));

        // Mutant code: Unreachable if-else statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // Unreachable code
            sb.append(" - This code should never execute");
        } else {
            // Original code
            return sb.toString();
        }

        // This line will never be executed due to the unreachable if-else branch
        return "This line should never execute";
    }

    public static void main(String[] args) {
        System.out.println(showBug());
    }
}