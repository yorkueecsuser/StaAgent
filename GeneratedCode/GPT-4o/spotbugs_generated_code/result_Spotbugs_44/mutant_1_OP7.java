class UnwrittenFieldExample {
    private String name; // This field is never written to

    public void showBug() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code inside while loop
            System.out.println("This will never print.");
        }
        
        System.out.println("Name: " + name.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    }

    private boolean getCondition() {
        return false; // This makes the while loop unreachable
    }

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    }
}