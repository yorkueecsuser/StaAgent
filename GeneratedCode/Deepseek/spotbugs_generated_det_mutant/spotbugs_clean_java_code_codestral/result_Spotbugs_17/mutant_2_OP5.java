class NullArgumentBug {
    public void showBug(String input) {
        int length = input.length(); // Original bug
        System.out.println("Length of the input: " + length);

        // Mutated code
        int value = getRandomValue(); // Non-constant value for switch condition
        switch (value) {
            case 1:
                System.out.println("This code should never be executed");
                break;
            default:
                // Do nothing
                break;
        }
    }

    private int getRandomValue() {
        return 0; // Always return 0, so the case block in the switch statement is unreachable
    }
}