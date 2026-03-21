class IncompatibleArrayCompareBug {
    public boolean showBug(Object[] array1, Object[] array2) {
int xdphshcb = 0;switch  (xdphshcb) {case 1:boolean lskboxwh = true;break;default:int doceuqdq = 505289376;break;}

        return array1.equals(array2); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
    
}
}