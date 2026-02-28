class NullFieldExample {

    private String nullableField = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)

    public NullFieldExample() {
        this.nullableField = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)
    }

    public String showBug() {
        boolean shouldRun = getCondition(); // Ensure the condition is dynamically determined
        if (shouldRun) {
            // This block is unreachable because shouldRun is never set to true in this context
            nullableField = "This will never be reached";
        } else {
            // This block is also unreachable for the same reason
            nullableField = "This will also never be reached";
        }
        return nullableField; // This will always return null due to the bug
    }

    private boolean getCondition() {
        // This method returns false, making the if-else branches unreachable
        return false;
    }

    public static void main(String[] args) {
        NullFieldExample example = new NullFieldExample();
        System.out.println("The value of nullableField is: " + example.showBug());
    }
}