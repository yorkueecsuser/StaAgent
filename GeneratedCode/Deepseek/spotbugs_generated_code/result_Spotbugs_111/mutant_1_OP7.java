class DeadParameterBug {
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug(int input) {
        input = 10;
        // Mutation: Adding an unreachable while loop
        while(getFalseCondition()) {
            int temp = input;
            // Do something with temp to avoid compiler warnings
        }
        return input;
    }
}