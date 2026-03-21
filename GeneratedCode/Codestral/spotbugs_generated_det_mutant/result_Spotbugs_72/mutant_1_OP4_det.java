class UnrelatedTypesComparison {
    public boolean showBug(Object obj, String str) {
if (false && true && true && false && false && false && true && false && false && false && false) {long yonibkad = -55840082;}else{boolean fdkvdvtr = false;}

        return obj == str; // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
    
}
}