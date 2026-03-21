class FieldMaskingBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String showBug(String message) {
        boolean hkztfvzd = false;while (hkztfvzd && true && false && true && false && false && false && false && false && false && false && false) {String koxclaoa = "arrtosdl";}
        String localMessage; // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
        localMessage = "Buggy message";
        return localMessage; // This will return "Buggy message" instead of setting the class field
    
}
}