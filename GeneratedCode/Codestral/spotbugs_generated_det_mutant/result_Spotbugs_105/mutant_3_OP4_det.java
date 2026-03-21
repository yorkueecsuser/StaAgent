class IncompatibleArrayCompareBug {
    public boolean showBug(Object[] array1, Object[] array2) {
if (false && false && true && true && false && false && false && true && true && true && false) {int qmczswrl = -164076330;}else{double nxtwdmuc = -279213584;}

        return array1.equals(array2); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
    
}
}