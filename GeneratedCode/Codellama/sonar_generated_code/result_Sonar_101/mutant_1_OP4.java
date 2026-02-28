class ConditionallyExecutedCode {
    public static void main(String[] args) {
        int a = 0;
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("a is 0"); // BUG: Conditionally executed code should be reachable
        } else {
            int b = 1;
            System.out.println("b is 1"); // Unreachable code
        }
    }
}