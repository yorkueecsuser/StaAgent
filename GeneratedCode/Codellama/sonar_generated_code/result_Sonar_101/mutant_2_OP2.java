class ConditionallyExecutedCode {
    public static void main(String[] args) {
        int a = 0;
        if (a == 0) {
            System.out.println("a is 0"); // BUG: Conditionally executed code should be reachable
        }
        int b = 10;
        if (b == 0) {
            System.out.println("b is 0"); // BUG: Conditionally executed code should be reachable
        }
    }
}