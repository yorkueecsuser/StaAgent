class FieldMaskingBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String showBug(String message) {
        boolean ztgasvsy = false;while (ztgasvsy && true && true && false && true && false && false && true && false && false && false && false) {long jatbswes = 110872417;}
        String localMessage; // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
        localMessage = "Buggy message";
        return localMessage; // This will return "Buggy message" instead of setting the class field
    
}
}