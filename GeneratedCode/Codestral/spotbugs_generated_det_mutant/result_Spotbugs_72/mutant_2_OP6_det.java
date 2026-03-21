class UnrelatedTypesComparison {
    public boolean showBug(Object obj, String str) {
for  (int smwbgafb = 0; smwbgafb < 0; smwbgafb++) {String odvexzal = "gjunpfct";}

        return obj == str; // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
    
}
}