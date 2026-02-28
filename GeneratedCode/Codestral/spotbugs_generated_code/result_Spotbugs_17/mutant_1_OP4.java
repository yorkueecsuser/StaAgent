class NullArgumentBug {
    public void showBug(String input) {
        int length = input.length();
        System.out.println("Length of the input: " + length);

        // Mutated code: Unreachable if-else statement
        boolean isNull = input == null;
        if (isNull) {
            System.out.println("This statement will never be executed.");
        } else {
            // This statement is reachable
            System.out.println("The input is not null.");
        }
    }
}