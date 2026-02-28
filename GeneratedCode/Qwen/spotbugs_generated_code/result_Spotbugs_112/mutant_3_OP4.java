class VariableObscuringField {
    private int value;

    public VariableObscuringField(int value) {
        this.value = value;
    }

    public int showBug() {
        int value = 10; // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD) 

        // Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute because shouldRun is always false
            value = 20;
        } else {
            // This block will always execute
            value = 30;
        }

        return value;
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        VariableObscuringField obj = new VariableObscuringField(5);
        System.out.println("Value returned by showBug: " + obj.showBug());
    }
}