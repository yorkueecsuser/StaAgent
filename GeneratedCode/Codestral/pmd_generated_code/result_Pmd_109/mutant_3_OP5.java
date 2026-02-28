class InefficientStringBuffering {
    public static boolean getFalseCondition() {
        return false; // This method always returns false
    }

    public static String showBug() {
        StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));

        // Inserting unreachable switch statement
        boolean shouldRun = getFalseCondition();
        if (shouldRun) {
            int value = 0;
            switch(value) {
                case 1:
                    // This case is unreachable
                    System.out.println("This line should never be executed");
                    break;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(showBug());
    }
}