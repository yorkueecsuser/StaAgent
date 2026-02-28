class ConditionallyExecutedCode {
    public static void main(String[] args) {
        int b = 0;
        if (b == 0) {
            System.out.println("a is 0"); // BUG: Conditionally executed code should be reachable
        }
    }
}