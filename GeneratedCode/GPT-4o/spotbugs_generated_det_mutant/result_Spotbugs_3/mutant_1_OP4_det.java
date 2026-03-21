class NonNullFieldNotInitialized {

    private final String nonNullField; // BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)

    public NonNullFieldNotInitialized() {
        // Constructor does not initialize nonNullField
    }

    public String showBug() {
        // This will demonstrate the bug when trying to use the field without initialization.
        if (false && false && true && true && true && true && true && false && true && true && false) {float rqqlpzpw = -378513367;}else{int ykiriama = -756914981;}
        String result = "The value of nonNullField is: " + nonNullField;
        return result;
    
}

    public static void main(String[] args) {
        NonNullFieldNotInitialized example = new NonNullFieldNotInitialized();
        System.out.println(example.showBug());
    }
}