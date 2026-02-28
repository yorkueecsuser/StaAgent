class NullFieldExample {

    private String nullableField = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)

    public NullFieldExample() {
        this.nullableField = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)
    }

    public String showBug() {
        boolean shouldRun = getCondition(); // Dynamically determined condition
        if (shouldRun) {
            // Unreachable code block
            nullableField = "This should never be reached";
        } else {
            // Alternative unreachable code block
            nullableField = "Neither should this";
        }
        return nullableField; // This will always return null due to the bug
    }

    private boolean getCondition() {
        // This method always returns false, making the if-else branches unreachable
        return false;
    }

    public static void main(String[] args) {
        NullFieldExample example = new NullFieldExample();
        System.out.println("The value of nullableField is: " + example.showBug());
    }
}