class UnwrittenFieldExample {
    private String message;

    public void showBug() {
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable block.");
        } else {
            // This block is always executed
            System.out.println("This is the reachable block.");
        }
        System.out.println(message.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    }

    private boolean getCondition() {
        return false; // This method ensures the if block is unreachable
    }

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    }
}