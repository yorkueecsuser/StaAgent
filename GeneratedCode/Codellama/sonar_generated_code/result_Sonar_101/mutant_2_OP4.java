class ConditionallyExecutedCode {
    public static void main(String[] args) {
        int a = 0;
        if (a == 0) {
            System.out.println("a is 0"); // BUG: Conditionally executed code should be reachable
            boolean condition = getCondition();
            if (condition) {
                // intentionally unreachable code
                System.out.println("This code is unreachable");
            } else {
                // reachable code
                System.out.println("This code is reachable");
            }
        }
    }

    private static boolean getCondition() {
        // non-final variable used to avoid compile-time constant
        boolean shouldRun = Math.random() > 0.5;
        return shouldRun;
    }
}