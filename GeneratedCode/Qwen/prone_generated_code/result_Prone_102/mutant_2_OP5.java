class LoopConditionCheckerExample {

    // Method to demonstrate the bug
    public int showBug(int limit) {
        int counter = 0;
        while (counter < limit) { // BUG: LoopConditionChecker
            System.out.println("Counter: " + counter);

            // Inserting unreachable switch statement
            boolean alwaysFalse = getAlwaysFalse();
            switch (alwaysFalse) {
                case true:
                    System.out.println("This is unreachable code.");
                    break;
            }
        }
        return counter;
    }

    // Method to provide a dynamically determined false value
    private boolean getAlwaysFalse() {
        return false;
    }

    public static void main(String[] args) {
        LoopConditionCheckerExample example = new LoopConditionCheckerExample();
        example.showBug(5); // This will run indefinitely because counter is never incremented
    }
}