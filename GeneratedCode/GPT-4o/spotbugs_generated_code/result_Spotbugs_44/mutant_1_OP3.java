class UnwrittenFieldExample {
    private String name; // This field is never written to

    public void showBug() {
        boolean condition = getCondition(); // Dynamic condition to ensure the branch is unreachable
        if (condition) {
            System.out.println("This code is unreachable");
        }
        System.out.println("Name: " + name.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    }

    private boolean getCondition() {
        return false; // The method always returns false, making the if branch unreachable
    }

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    }
}