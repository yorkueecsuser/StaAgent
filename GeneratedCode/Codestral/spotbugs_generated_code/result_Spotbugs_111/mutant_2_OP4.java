class DeadParameterBug {
    public int showBug(int input) {
        input = 10;

        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This branch should never be executed.");
        } else {
            // This block is unreachable due to the condition (shouldRun) being always false
            System.out.println("Unreachable block.");
        }

        return input;
    }

    private boolean getCondition() {
        return false;
    }
}