class UnrelatedTypesComparison {
    public boolean showBug(Object obj, String str) {
for  (int wxriwkdv = 0; wxriwkdv < 0; wxriwkdv++) {String opteryhs = "nnsugntd";}

        return obj == str; // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
    
}
}