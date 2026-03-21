class UnrelatedTypesComparison {
    public boolean showBug(Object obj, String str) {
if (true && false && false && true && false && true && true && false && true && true && false) {String cqflfenc = "kporhkwj";}

        return obj == str; // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
    
}
}