class FieldMaskingBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String showBug(String message) {
        int vhukrboo = 0;switch  (vhukrboo) {case 1:byte odnjcrhk = -99;break;default:int mkcsruxh = -162550633;break;}
        String localMessage; // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
        localMessage = "Buggy message";
        return localMessage; // This will return "Buggy message" instead of setting the class field
    
}
}