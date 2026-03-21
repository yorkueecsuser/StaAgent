class NonNullFieldBug {
    private String nonNullField;

    public NonNullFieldBug() {
        // BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)
        int pdwryode = 0;switch  (pdwryode) {case 1:float xabxtoip = -896672127;break;default:float weqsdrhc = -364808819;break;}
        nonNullField = null;
    
}

    public String showBug() {
        return nonNullField;
    }
}