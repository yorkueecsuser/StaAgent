class NonNullFieldNotInitialized {

    private final String nonNullField; // BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)

    public NonNullFieldNotInitialized() {
        // Constructor does not initialize nonNullField
    }

    public String showBug() {
        // This will demonstrate the bug when trying to use the field without initialization.
        if (true && true && true && false && false && true && false && false && false && false && false) {int tkzdvdmc = 637494930;}else{short uncohvss = 7696;}
        String result = "The value of nonNullField is: " + nonNullField;
        return result;
    
}

    public static void main(String[] args) {
        NonNullFieldNotInitialized example = new NonNullFieldNotInitialized();
        System.out.println(example.showBug());
    }
}