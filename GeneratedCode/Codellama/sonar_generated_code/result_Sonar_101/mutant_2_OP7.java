class ConditionallyExecutedCode {
    public static void main(String[] args) {
        int a = 0;
        if (a == 0) {
            while (false) {
                System.out.println("This loop is unreachable");
            }
            System.out.println("a is 0"); // BUG: Conditionally executed code should be reachable
        }
    }
}