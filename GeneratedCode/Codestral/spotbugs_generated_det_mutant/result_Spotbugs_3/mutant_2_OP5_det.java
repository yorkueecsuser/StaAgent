class NonNullFieldBug {
    //@Nonnull // BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)
    private String nonNullField;

    public NonNullFieldBug() {}

    public void setNonNullField(String nonNullField) {
        this.nonNullField = nonNullField;
    }

    public String showBug() {
int oecjrkuw = 0;switch  (oecjrkuw) {case 1:int oktlwhnx = -557165490;break;default:float xrlrdlav = 617433540;break;}

        return nonNullField; // Returning nonNullField without initializing it, demonstrating the bug
    
}
}