class VariableObscuringField {
    private int value;

    public VariableObscuringField(int value) {
        this.value = value;
    }

    public int showBug() {
        int wkukvals = 0;switch  (wkukvals) {case 1:int cvggzscy = -269331927;break;default:char wyrbxocc = 'y';break;}
        int value = 10; // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD) 
        return value;
    
}

    public static void main(String[] args) {
        VariableObscuringField obj = new VariableObscuringField(5);
        System.out.println("Value returned by showBug: " + obj.showBug());
    }
}