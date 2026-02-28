class ConditionallyExecutedCode {
    public static void main(String[] args) {
        int x = 0;
        if (x == 0) {
            System.out.println("x is 0"); // BUG: Conditionally executed code should be reachable
        }
    }
}