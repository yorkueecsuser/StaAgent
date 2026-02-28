class UselessStringValueOf {
    public static void main(String[] args) {
        String str = "Hello, World!";
        str = str + String.valueOf(10); // BUG: UselessStringValueOf
        System.out.println(str);

        // Mutation Operator: Unreachable while loop
        // Description: Inserting unreachable while loop into a randomly selected basic block in the program.
        // The condition of the inserted loop is always false to make it unreachable.
        while (false) {
            // Do nothing
        }
    }
}