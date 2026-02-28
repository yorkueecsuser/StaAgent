class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        char c = 'a';
        StringBuilder sb = new StringBuilder(c);  // BUG: StringBuilderInitWithChar
        System.out.println(sb.toString());

        // Mutation Operator name: Unreachable while loop
        // Mutation Operator description: Inserting unreachable while loop into a randomly selected basic block in the program. The condition of the inserted loop is always false to make it unreachable.
        // Adding an unreachable while loop in the showBug method
        boolean condition = false;
        while (condition) {
            // Unreachable code
        }
    }
}