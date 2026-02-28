class DeadParameterBug {
    public int showBug(int input) {
        input = 10; // Original bug

        // Mutated code: Unreachable switch statement
        int unreachableValue = getUnreachableValue(); // Assume this method always returns a value that cannot match case 1
        switch (unreachableValue) {
            case 1:
                System.out.println("This line should never be reached.");
                break;
        }

        return input;
    }

    private int getUnreachableValue() {
        return -1; // This value will never match case 1 in the switch statement
    }
}