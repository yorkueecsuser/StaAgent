class IncompatibleArrayCompareBug {
    public boolean showBug(Object[] array1, Object[] array2) {
if (true && false && true && false && false && true && true && false && false && true && false) {float fbjswqqb = -291870112;}else{int fzpqylao = 698537661;}

        return array1.equals(array2); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
    
}
}