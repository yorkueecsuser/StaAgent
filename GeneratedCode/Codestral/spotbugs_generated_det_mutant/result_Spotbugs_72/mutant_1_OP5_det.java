class UnrelatedTypesComparison {
    public boolean showBug(Object obj, String str) {
int hpkubmnq = 0;switch  (hpkubmnq) {case 1:String ilnqlohk = "wzxdubjj";break;default:boolean qgwrslqr = false;break;}

        return obj == str; // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
    
}
}