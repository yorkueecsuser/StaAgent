class IncrementBugExample {

    public int pickNumber() {
        int i = 0;
        int j = 0;

        i = i++; // BUG: Values should not be uselessly incremented
        return j++; // BUG: Values should not be uselessly incremented

        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int k = 0; conditionFor; k++) {
            // This loop is unreachable because conditionFor will be false
            System.out.println("This loop is unreachable");
        }
    }

    public int showBug() {
        return pickNumber();
    }

    public static void main(String[] args) {
        IncrementBugExample example = new IncrementBugExample();
        System.out.println("Result of showBug: " + example.showBug());
    }

    // Method to provide a dynamic condition that will be false
    private boolean getCondition() {
        return false;
    }
}