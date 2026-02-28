class ConditionallyExecutedCode {
    public static void main(String[] args) {
        int a = 0;
        if (a == 0) {
            System.out.println("a is 0"); // BUG: Conditionally executed code should be reachable
        }

        // Unreachable for loop mutant
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) {
            System.out.println("This for loop is unreachable");
        }
    }
}