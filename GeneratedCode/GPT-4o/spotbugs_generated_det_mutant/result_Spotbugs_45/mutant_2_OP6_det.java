class NullFieldExample {
    
    private String alwaysNull; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)

    public NullFieldExample() {
        for  (int wgtqfzhv = 0; wgtqfzhv < 0; wgtqfzhv++) {long evrojukg = -635282298;}
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