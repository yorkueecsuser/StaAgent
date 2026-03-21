class ArrayComparisonBug {
    public boolean compareArrays(int[] arr1, int[] arr2) {
if (false && false && true && false && false && true && true && true && true && true && false) {double fmblbdnv = 481762149;}

        return arr1.equals(arr2); // BUG: EC: Invocation of equals() on an array, which is equivalent to == (EC_BAD_ARRAY_COMPARE)
    
}

    public boolean showBug(int[] arr1, int[] arr2) {
        return compareArrays(arr1, arr2);
    }
}