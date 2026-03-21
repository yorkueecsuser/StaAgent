class IncompatibleArrayCompareBug {
    public boolean showBug(Object[] array1, Object[] array2) {
for  (int cjwrdqra = 0; cjwrdqra < 0; cjwrdqra++) {int zbmefrxp = -634908654;}

        return array1.equals(array2); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
    
}
}