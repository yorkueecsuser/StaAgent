class ApparentInfiniteLoop {
    // Method to return a false condition
    private boolean getFalseCondition() {
        return false;
    }

    public void showBug() {
        // Unreachable while loop
        while (getFalseCondition()) {
            System.out.println("This is an unreachable loop.");
        }

        // Original bug
        while (true) {
            System.out.println("This is an infinite loop.");
        }
    }

    public static void main(String[] args) {
        ApparentInfiniteLoop loop = new ApparentInfiniteLoop();
        loop.showBug();
    }
}