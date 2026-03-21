class UnrelatedTypesComparison {
    public boolean showBug(Object obj, String str) {
int wzwvhonf = 0;switch  (wzwvhonf) {case 1:float tdxmwigq = 5204669;break;default:float admrmqsk = 825495399;break;}

        return obj == str; // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
    
}
}