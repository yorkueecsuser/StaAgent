class MutableStaticFieldExample {
    // This mutable static field could be changed by malicious code or by accident.
    public static StringBuilder mutableStaticField = new StringBuilder("Initial Value"); // BUG: MS: Field should be package protected (MS_PKGPROTECT)

    public String showBug(String newValue) {
        // Demonstrating the bug by changing the mutable static field
        mutableStaticField.setLength(0); // Clearing the original value
        mutableStaticField.append(newValue); // Setting a new value

        // Inserting an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            mutableStaticField.append("This will never be appended");
        } else {
            // This block is also unreachable because getCondition() always returns false
            mutableStaticField.append("This will also never be appended");
        }

        return mutableStaticField.toString();
    }

    private boolean getCondition() {
        // Always return false to ensure the if-else block is unreachable
        return false;
    }

    public static void main(String[] args) {
        MutableStaticFieldExample example = new MutableStaticFieldExample();
        System.out.println(example.showBug("Modified Value"));
    }
}