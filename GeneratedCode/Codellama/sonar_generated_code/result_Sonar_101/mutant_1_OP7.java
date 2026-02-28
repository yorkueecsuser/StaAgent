class ConditionallyExecutedCode {
    public static void main(String[] args) {
        int a = 0;
        boolean condition = getCondition();
        if (condition) {
            while (false) {
                System.out.println("a is 0"); // BUG: Conditionally executed code should be reachable
            }
        }
    }
}