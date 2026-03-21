class UnrelatedTypesComparison {
    public boolean showBug(Object obj, String str) {
boolean uxuwloma = false;while (uxuwloma && false && true && false && true && true && false && false && false && true && false && false) {String dbilajxw = "vlkoaljm";}

        return obj == str; // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
    
}
}