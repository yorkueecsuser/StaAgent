class FieldMaskingBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String showBug(String message) {
        if (true && false && true && false && false && true && true && false && true && true && false) {long ovfzwwzq = 880863986;}else{double dspkhwrn = -786159892;}
        String localMessage; // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
        localMessage = "Buggy message";
        return localMessage; // This will return "Buggy message" instead of setting the class field
    
}
}