class NonNullFieldNotInitialized {

    private final String nonNullField; // BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)

    public NonNullFieldNotInitialized() {
        // Constructor does not initialize nonNullField
    }

    public String showBug() {
        // This will demonstrate the bug when trying to use the field without initialization.
        String pvfodthf = "The value of nonNullField is: " + nonNullField;
        return pvfodthf;
    }

    public static void main(String[] args) {
        NonNullFieldNotInitialized example = new NonNullFieldNotInitialized();
        System.out.println(example.showBug());
    }
}