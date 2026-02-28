class UnwrittenFieldExample {
    private String name; // This field is never written to

    public void showBug() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This will never print because the loop is unreachable.");
        }
        System.out.println("Name: " + name.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    }

    public boolean getCondition() {
        return false; // Ensures the while loop is unreachable
    }

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    }
}