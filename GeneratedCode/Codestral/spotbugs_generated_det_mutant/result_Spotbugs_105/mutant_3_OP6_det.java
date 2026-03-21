class IncompatibleArrayCompareBug {
    public boolean showBug(Object[] array1, Object[] array2) {
for  (int hlupnedp = 0; hlupnedp < 0; hlupnedp++) {boolean xzrlgczk = true;}

        return array1.equals(array2); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
    
}
}