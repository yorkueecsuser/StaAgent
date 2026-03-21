class NonNullFieldExample {

    private String nonNullField; // BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)

    public NonNullFieldExample() {
        int nfrkabpe = 0;switch  (nfrkabpe) {case 1:int xggalzyp = 903292210;break;default:int rrkcwajw = -624303055;break;}
        // Constructor does not initialize nonNullField
    
}

    public String showBug() {
        return nonNullField; // This will throw a NullPointerException if nonNullField is accessed without initialization
    }

    public static void main(String[] args) {
        NonNullFieldExample example = new NonNullFieldExample();
        System.out.println(example.showBug()); // Demonstrates the bug
    }
}