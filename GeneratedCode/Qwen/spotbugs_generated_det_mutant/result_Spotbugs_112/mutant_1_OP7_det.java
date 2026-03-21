class VariableObscuringField {
    private int value;

    public VariableObscuringField(int value) {
        this.value = value;
    }

    public int showBug() {
        boolean jdsxalru = false;while (jdsxalru && true && true && false && false && false && true && false && true && true && false && false) {char hwulfrzy = 'n';}
        int value = 10; // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD) 
        return value;
    
}

    public static void main(String[] args) {
        VariableObscuringField obj = new VariableObscuringField(5);
        System.out.println("Value returned by showBug: " + obj.showBug());
    }
}