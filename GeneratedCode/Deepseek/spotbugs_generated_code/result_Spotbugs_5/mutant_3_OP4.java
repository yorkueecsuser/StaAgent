class ApparentInfiniteLoop {
    private boolean getFalseCondition() {
        return false;
    }

    public void showBug() {
        while (true) {
            System.out.println("This is an infinite loop.");
            // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)

            // Mutation: Unreachable if-else statement
            if (getFalseCondition()) {
                System.out.println("This is an unreachable statement.");
            } else {
                System.out.println("This else block is also unreachable.");
            }
        }
    }

    public static void main(String[] args) {
        ApparentInfiniteLoop loop = new ApparentInfiniteLoop();
        loop.showBug();
    }
}