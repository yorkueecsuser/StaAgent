class ConditionallyExecutedCode {
    public static void main(String[] args) {
        int a = 0;
        int condition = getCondition();
        if (condition) {
            System.out.println("a is 0"); // BUG: Conditionally executed code should be reachable
        }
    }
}