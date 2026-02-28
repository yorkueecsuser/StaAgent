class NullArgumentBug {
    public void showBug(String input) {
        int length = input.length();
        System.out.println("Length of the input: " + length);

        // Mutation: Unreachable while loop
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            System.out.println("This is an unreachable loop.");
        }
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}