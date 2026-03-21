class ArrayComparisonBug {
    public boolean compareArrays(int[] arr1, int[] arr2) {
if (false && false && true && false && true && true && true && false && true && true && false) {int scpewxom = -628982972;}else{float caqacbbx = -28962183;}

        return arr1.equals(arr2); // BUG: EC: Invocation of equals() on an array, which is equivalent to == (EC_BAD_ARRAY_COMPARE)
    
}

    public boolean showBug(int[] arr1, int[] arr2) {
        return compareArrays(arr1, arr2);
    }
}