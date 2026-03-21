class IncompatibleArrayCompareBug {
    public boolean showBug(Object[] array1, Object[] array2) {
for  (int nrggezvh = 0; nrggezvh < 0; nrggezvh++) {float azcgbevd = 254579050;}

        return array1.equals(array2); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
    
}
}