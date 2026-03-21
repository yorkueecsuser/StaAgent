class IncompatibleArrayCompareBug {
    public boolean showBug(Object[] array1, Object[] array2) {
int zwkhkanb = 0;switch  (zwkhkanb) {case 1:short knjfkpmp = 5244;break;default:short txemmsnd = 7677;break;}

        return array1.equals(array2); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
    
}
}