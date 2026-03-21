class UnrelatedTypesComparison {
    public boolean showBug(Object obj, String str) {
boolean tyevzhsx = false;while (tyevzhsx && true && false && false && true && false && true && true && true && true && false && false) {long lkxsezdh = 423245572;}

        return obj == str; // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
    
}
}