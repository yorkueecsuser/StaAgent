class UnrelatedTypesComparison {
    public boolean showBug(Object obj, String str) {
int jonhljak = 0;switch  (jonhljak) {case 1:short dewnpsml = 7597;break;default:char vyvzongg = 'f';break;}

        return obj == str; // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
    
}
}