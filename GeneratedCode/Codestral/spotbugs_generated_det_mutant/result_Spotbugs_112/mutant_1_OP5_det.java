class FieldMaskingBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String showBug(String message) {
        int lfixdnym = 0;switch  (lfixdnym) {case 1:short wytddnoc = -5817;break;default:char dnayskwu = 'w';break;}
        String localMessage; // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
        localMessage = "Buggy message";
        return localMessage; // This will return "Buggy message" instead of setting the class field
    
}
}