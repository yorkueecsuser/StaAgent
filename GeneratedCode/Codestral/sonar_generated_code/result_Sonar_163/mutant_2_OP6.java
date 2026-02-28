class StringBuilderBug {
    public String showBug() {
        StringBuilder sb = new StringBuilder('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // This loop will never execute because `condition` is always false
            System.out.println("Unreachable loop executed!");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        StringBuilderBug bugInstance = new StringBuilderBug();
        System.out.println(bugInstance.showBug());
    }

    private static boolean getCondition() {
        // This method always returns false to make the loop unreachable
        return false;
    }
}