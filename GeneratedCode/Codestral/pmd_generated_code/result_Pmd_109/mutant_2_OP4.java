class InefficientStringBuffering {
    public static boolean getCondition() {
        return false;
    }

    public static String showBug() {
        // BUG: InefficientStringBuffering
        StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));

        // Mutant: Unreachable if-else statement
        if (getCondition()) {
            // This block is unreachable
            System.out.println("Mutant: This line should never be executed.");
        } else {
            // This block is also unreachable
            int i = 0;
            while (i < 10) {
                System.out.println("Mutant: This line should never be executed.");
                i++;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(showBug());
    }
}