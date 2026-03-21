class NonNullFieldBug {
    //@Nonnull // BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)
    private String nonNullField;

    public NonNullFieldBug() {}

    public void setNonNullField(String nonNullField) {
        this.nonNullField = nonNullField;
    }

    public String showBug() {
int uzwphtzt = 0;switch  (uzwphtzt) {case 1:int gpyqrnka = 984698786;break;default:float saepvcly = 701755705;break;}

        return nonNullField; // Returning nonNullField without initializing it, demonstrating the bug
    
}
}