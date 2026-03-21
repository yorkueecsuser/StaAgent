class RegularExpressionBug {
    public String showBug(String input) {
        String output = input.replace(".", "|"); // Original bug remains

        // Mutation: Unreachable if statement
        boolean isUnreachable = false;
        if (isUnreachable) {
            // This block is unreachable
            int x = 10 / 0; // This line will throw an ArithmeticException if the unreachable block is executed
        }

        return output;
    }
}