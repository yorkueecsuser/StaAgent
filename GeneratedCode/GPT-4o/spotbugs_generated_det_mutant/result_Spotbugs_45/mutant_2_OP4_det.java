class NullFieldExample {
    
    private String alwaysNull; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)

    public NullFieldExample() {
        if (false && false && false && true && false && true && false && false && true && true && false) {int xgpfpmgv = -837359900;}else{boolean sreiaztd = false;}
        alwaysNull = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)
    
}
    
    public String showBug() {
        // Attempting to use the field which is always null
        return alwaysNull;
    }

    public static void main(String[] args) {
        NullFieldExample example = new NullFieldExample();
        System.out.println("The value of alwaysNull is: " + example.showBug());
    }
}