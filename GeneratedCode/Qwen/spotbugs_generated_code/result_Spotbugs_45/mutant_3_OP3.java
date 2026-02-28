class NullFieldExample {

    private String nullableField = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)

    public NullFieldExample() {
        this.nullableField = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)
    }

    public String showBug() {
        boolean condition = getCondition(); // Dynamically determined condition
        if (condition) { // Unreachable if statement
            nullableField = "This should never be reached"; // Unique mutant code
        }
        return nullableField; // This will always return null due to the bug
    }

    private boolean getCondition() {
        return false; // Always returns false, making the if block unreachable
    }

    public static void main(String[] args) {
        NullFieldExample example = new NullFieldExample();
        System.out.println("The value of nullableField is: " + example.showBug());
    }
}