class UnwrittenFieldExample {
    private String name; // This field is never written to

    public void showBug() {
        // Inserting unreachable for loop
        boolean runLoop = getCondition();
        for (int i = 0; runLoop; i++) {
            System.out.println("This is an unreachable for loop");
        }
        
        System.out.println("Name: " + name.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    }

    private boolean getCondition() {
        return false; // Ensuring the loop is unreachable
    }

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    }
}