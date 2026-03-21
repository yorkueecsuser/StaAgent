class UnrelatedTypesComparison {
    public boolean showBug(Object obj, String str) {
boolean rcmomnff = false;while (rcmomnff && false && true && false && true && false && true && false && false && true && true && false) {byte bvpqalkf = 107;}

        return obj == str; // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
    
}
}