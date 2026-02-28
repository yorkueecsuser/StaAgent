class ConditionallyExecutedCode {
    public static void main(String[] args) {
        int z = 0;
        if (z == 0) {
            System.out.println("z is 0"); // BUG: Conditionally executed code should be reachable
        }
    }
}