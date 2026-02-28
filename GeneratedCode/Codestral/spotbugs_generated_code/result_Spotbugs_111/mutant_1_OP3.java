class DeadParameterBug {
    public int showBug(int input) {
        input = 10;
        // Mutation: Unreachable if statement
        if (isFalse()) {
            // This block is unreachable
            System.out.println("Unreachable code");
        }
        return input;
    }

    private boolean isFalse() {
        return false;
    }
}