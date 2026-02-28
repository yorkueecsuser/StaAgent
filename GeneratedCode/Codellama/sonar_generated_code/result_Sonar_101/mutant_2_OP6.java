class ConditionallyExecutedCode {
    public static void main(String[] args) {
        int a = 0;
        if (a == 0) {
            System.out.println("a is 0"); // BUG: Conditionally executed code should be reachable
            for (int i = 0; false; i++) {
                // Unreachable for loop
            }
        }
    }
}