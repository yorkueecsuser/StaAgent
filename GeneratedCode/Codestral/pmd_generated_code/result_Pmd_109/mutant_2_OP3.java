class InefficientStringBuffering {
    public static String showBug() {
        // BUG: InefficientStringBuffering
        StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));

        // Mutant code: Unreachable if statement
        boolean shouldExecute = false;
        if (shouldExecute) {
            System.out.println("This line will never be executed");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(showBug());
    }
}