class ApparentInfiniteLoop {
    private boolean getFalseCondition() {
        return false;
    }

    public void showBug() {
        while (true) {
            System.out.println("This is an infinite loop.");
            // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
        }

        // Mutated Code: Adding unreachable while loop
        while (getFalseCondition()) {
            System.out.println("This is an unreachable loop.");
        }
    }

    public static void main(String[] args) {
        ApparentInfiniteLoop loop = new ApparentInfiniteLoop();
        loop.showBug();
    }
}