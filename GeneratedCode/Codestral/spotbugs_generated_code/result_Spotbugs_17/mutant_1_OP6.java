class NullArgumentBug {
    public void showBug(String input) {
        boolean condition = false; // Mutant: Unreachable for loop
        for (int i = 0; condition; i++) { // Unreachable loop
            System.out.println("Unreachable code");
        }
        int length = input.length(); // Original bug persists
        System.out.println("Length of the input: " + length);
    }
}