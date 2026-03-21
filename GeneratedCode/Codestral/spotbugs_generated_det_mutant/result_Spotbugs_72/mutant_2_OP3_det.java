class UnrelatedTypesComparison {
    public boolean showBug(Object obj, String str) {
if (false && false && true && false && true && true && false && true && true && true && false) {long jicsudbj = -139947135;}

        return obj == str; // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
    
}
}