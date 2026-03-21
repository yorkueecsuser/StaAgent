class NonNullFieldBug {
    //@Nonnull // BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)
    private String nonNullField;

    public NonNullFieldBug() {}

    public void setNonNullField(String nonNullField) {
        this.nonNullField = nonNullField;
    }

    public String showBug() {
int cfoojixl = 0;switch  (cfoojixl) {case 1:boolean hvppqfbo = true;break;default:float rrivfyku = -901088086;break;}

        return nonNullField; // Returning nonNullField without initializing it, demonstrating the bug
    
}
}