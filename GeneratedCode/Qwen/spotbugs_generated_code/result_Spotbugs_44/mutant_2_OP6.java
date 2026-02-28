class UnwrittenFieldExample {
    private String message;

    public void showBug() {
        System.out.println(message.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)

        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is never set to true
            System.out.println("This loop should never execute.");
        }
    }

    private boolean getCondition() {
        return false; // This method always returns false, ensuring the loop is unreachable
    }

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    }
}