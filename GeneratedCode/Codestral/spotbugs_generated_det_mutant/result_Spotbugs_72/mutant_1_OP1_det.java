class UnrelatedTypesComparison {
    public boolean showBug(Object obj, String str) {
boolean eozzfrtt = true;

        return obj == str; // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
    
}
}