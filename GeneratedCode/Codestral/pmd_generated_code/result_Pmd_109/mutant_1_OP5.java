class InefficientStringBuffering {
    public static String showBug() {
        // BUG: InefficientStringBuffering
        StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));

        // MUTATION: Unreachable switch statement
        boolean unreachableCondition = false;
        int value = getValue();
        switch (unreachableCondition? value : -1) {
            case 1:
                // This case is unreachable due to the false condition in the switch.
                System.out.println("This is an unreachable switch case");
                break;
        }

        return sb.toString();
    }

    private static int getValue() {
        return 0; // This value is not used as the condition is always false.
    }

    public static void main(String[] args) {
        System.out.println(showBug());
    }
}