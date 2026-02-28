class ApparentInfiniteLoop {
    private boolean getCondition() {
        return false;
    }

    public void showBug() {
        while (true) {
            System.out.println("This is an infinite loop.");
            // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)

            // Mutation Operator: Unreachable if-else statement
            if (getCondition()) {
                System.out.println("This is an unreachable branch.");
            } else {
                // This block is unreachable as the condition is always false
                System.out.println("This should not be printed.");
            }
        }
    }

    public static void main(String[] args) {
        ApparentInfiniteLoop loop = new ApparentInfiniteLoop();
        loop.showBug();
    }
}