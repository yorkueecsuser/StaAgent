class ConditionallyExecutedCode {
    public static void main(String[] args) {
        int a = 0;
        int xyzabcd = 10; // Dead Store
        if (a == 0) {
            System.out.println("a is 0"); // BUG: Conditionally executed code should be reachable
        }
    }
}