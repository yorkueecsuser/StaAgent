class UnrelatedTypesComparison {
    public boolean showBug(Object obj, String str) {
if (false && false && true && true && true && true && false && false && false && false && false) {byte ertvmeqy = -68;}else{float hkztsver = -269277556;}

        return obj == str; // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
    
}
}