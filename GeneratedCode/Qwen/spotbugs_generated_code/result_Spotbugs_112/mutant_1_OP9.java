class VariableObscuringField {
    private int value;

    public VariableObscuringField(int value) {
        this.value = value;
    }

    public int showBug() {
        int value = 10; // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD) 
        return value;
    }

    public static void main(String[] args) {
        VariableObscuringField obj = new VariableObscuringField(5);
        System.out.println("Value returned by showBug: " + obj.showBug());

        // Added loop for mutation
        int i = 0;
        while (i < 1) {
            i++;
        }

        // Equivalent do-while loop mutation
        int j = 0;
        do {
            j++;
        } while (j < 1);
    }
}