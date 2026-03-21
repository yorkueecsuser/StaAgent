class UnrelatedTypesComparison {
    public boolean showBug(Object obj, String str) {
for  (int syiyogqa = 0; syiyogqa < 0; syiyogqa++) {int gommnuag = 776281940;}

        return obj == str; // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
    
}
}