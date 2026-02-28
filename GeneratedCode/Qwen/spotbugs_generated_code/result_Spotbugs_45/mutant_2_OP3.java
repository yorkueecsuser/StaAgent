class NullFieldExample {

    private String nullableField = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)

    public NullFieldExample() {
        this.nullableField = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)
    }

    public String showBug() {
        boolean condition = getCondition();
        if (condition) { // Unreachable if statement
            nullableField = "This will never be executed"; // Unique code to avoid generic mutation
        }
        return nullableField; // This will always return null due to the bug
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always false
    }

    public static void main(String[] args) {
        NullFieldExample example = new NullFieldExample();
        System.out.println("The value of nullableField is: " + example.showBug());
    }
}