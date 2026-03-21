class IncompatibleArrayCompareBug {
    public boolean showBug(Object[] array1, Object[] array2) {
int sbxrblgm = 0;switch  (sbxrblgm) {case 1:short fishfrfv = -9422;break;default:short oopceuje = 6119;break;}

        return array1.equals(array2); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
    
}
}