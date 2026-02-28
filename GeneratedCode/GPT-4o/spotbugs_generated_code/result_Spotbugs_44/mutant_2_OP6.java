class UnwrittenFieldExample {
    private String name; // This field is never written to

    public void showBug() {
        // Inserted unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line is unreachable due to the condition.");
        }

        System.out.println("Name: " + name.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    }

    private boolean getCondition() {
        return false; // This will make the for loop unreachable
    }

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    }
}