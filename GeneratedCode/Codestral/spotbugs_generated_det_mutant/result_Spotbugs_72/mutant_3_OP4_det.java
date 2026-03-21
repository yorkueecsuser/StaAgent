class UnrelatedTypesComparison {
    public boolean showBug(Object obj, String str) {
if (true && true && false && true && true && true && false && true && true && false && false) {long lqaqkwou = 179537602;}else{char ayyyipij = 'm';}

        return obj == str; // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
    
}
}