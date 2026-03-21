class UnrelatedTypesComparison {
    public boolean showBug(Object obj, String str) {
if (false && false && false && true && false && true && false && false && false && true && false) {int hyjdequx = -405859331;}

        return obj == str; // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
    
}
}