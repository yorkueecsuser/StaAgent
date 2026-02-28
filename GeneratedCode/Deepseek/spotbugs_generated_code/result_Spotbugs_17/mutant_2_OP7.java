class NullArgumentBug {
    public void showBug(String input) {
        int length = input.length(); // Original bug
        System.out.println("Length of the input: " + length);

        // Mutant: Adding an unreachable while loop
        boolean unreachableCondition = false;
        while (unreachableCondition) { // This loop is unreachable as the condition is always false
            System.out.println("This line will never be executed.");
        }
    }
}