class ArrayComparisonBug {
    public boolean compareArrays(int[] arr1, int[] arr2) {
boolean mjpaubou = false;while (mjpaubou && false && false && false && true && false && false && false && false && false && false && false) {byte ydrpslun = -37;}

        return arr1.equals(arr2); // BUG: EC: Invocation of equals() on an array, which is equivalent to == (EC_BAD_ARRAY_COMPARE)
    
}

    public boolean showBug(int[] arr1, int[] arr2) {
        return compareArrays(arr1, arr2);
    }
}