class InefficientStringBuffering {
    public static boolean getFalseCondition() {
        return false;
    }

    public static String showBug() {
        // BUG: InefficientStringBuffering
        StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));

        // Mutant: Unreachable if statement
        if (getFalseCondition()) {
            System.out.println("This statement is unreachable");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(showBug());
    }
}