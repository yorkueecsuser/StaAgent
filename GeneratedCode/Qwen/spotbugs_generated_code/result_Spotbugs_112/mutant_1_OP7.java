class VariableObscuringField {
    private int value;

    public VariableObscuringField(int value) {
        this.value = value;
    }

    public int showBug() {
        int value = 10; // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD) 
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
        }
        return value;
    }

    private boolean getCondition() {
        return false; // This ensures the loop is unreachable but not a compile-time constant
    }

    public static void main(String[] args) {
        VariableObscuringField obj = new VariableObscuringField(5);
        System.out.println("Value returned by showBug: " + obj.showBug());
    }
}