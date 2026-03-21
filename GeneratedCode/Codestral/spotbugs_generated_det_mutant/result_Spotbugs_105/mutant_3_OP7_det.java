class IncompatibleArrayCompareBug {
    public boolean showBug(Object[] array1, Object[] array2) {
boolean nqozmpgk = false;while (nqozmpgk && false && true && true && false && true && false && false && true && true && true && false) {char earbrkdx = 'f';}

        return array1.equals(array2); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
    
}
}