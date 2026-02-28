class InefficientStringBuffering {
    public static String showBug() {
        // BUG: InefficientStringBuffering
        StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));

        // MUTATION: Unreachable while loop
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // Unreachable code
            System.out.println("This code will never be executed.");
        }

        return sb.toString();
    }

    public static boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        System.out.println(showBug());
    }
}