class IncompatibleArrayCompareBug {
    public boolean showBug(Object[] array1, Object[] array2) {
boolean aoowknun = false;while (aoowknun && true && true && true && false && false && true && false && true && false && true && false) {float ubztwbcv = 931127030;}

        return array1.equals(array2); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
    
}
}