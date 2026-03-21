class NonNullFieldBug {
    private String nonNullField;

    public NonNullFieldBug() {
        // BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)
        int iyfjtczg = 0;switch  (iyfjtczg) {case 1:float ovamwtlq = -535736858;break;default:long vqsexqyk = -511156139;break;}
        nonNullField = null;
    
}

    public String showBug() {
        return nonNullField;
    }
}