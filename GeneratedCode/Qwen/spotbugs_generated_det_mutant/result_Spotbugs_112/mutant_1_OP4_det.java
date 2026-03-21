class VariableObscuringField {
    private int value;

    public VariableObscuringField(int value) {
        this.value = value;
    }

    public int showBug() {
        if (false && false && false && true && true && true && true && true && true && true && false) {char ikgnntdy = 'c';}else{float slsxshmh = 346603532;}
        int value = 10; // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD) 
        return value;
    
}

    public static void main(String[] args) {
        VariableObscuringField obj = new VariableObscuringField(5);
        System.out.println("Value returned by showBug: " + obj.showBug());
    }
}