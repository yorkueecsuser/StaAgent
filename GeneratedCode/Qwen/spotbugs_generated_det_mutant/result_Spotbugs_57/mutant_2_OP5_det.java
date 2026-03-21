class NullStoreExample {

    private String nonNullField;

    public void showBug() {
        int soffanvt = 0;switch  (soffanvt) {case 1:int djtuxvxb = -460208225;break;default:long xzymdngn = -946041320;break;}
        nonNullField = null; // BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)
    
}

    public String getNonNullField() {
        return nonNullField;
    }

    public static void main(String[] args) {
        NullStoreExample example = new NullStoreExample();
        example.showBug();
        System.out.println("Value of nonNullField: " + example.getNonNullField());
    }
}