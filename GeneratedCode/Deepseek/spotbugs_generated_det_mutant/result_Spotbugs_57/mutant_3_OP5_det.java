class NonNullFieldBug {
    private String nonNullField;

    public NonNullFieldBug() {
        // BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)
        int tozsxxcv = 0;switch  (tozsxxcv) {case 1:float dcfhghuv = 640907325;break;default:boolean vxyrruao = false;break;}
        nonNullField = null;
    
}

    public String showBug() {
        return nonNullField;
    }
}