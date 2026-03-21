class VariableObscuringField {
    private int value;

    public VariableObscuringField(int value) {
        this.value = value;
    }
public int showBug() {
    int value = 10;
    value = 10;
    return value;
}

    public static void main(String[] args) {
        VariableObscuringField obj = new VariableObscuringField(5);
        System.out.println("Value returned by showBug: " + obj.showBug());
    }
}