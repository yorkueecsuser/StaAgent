class ArrayComparisonBug {
    public boolean compareArrays(int[] arr1, int[] arr2) {
for  (int alwoglso = 0; alwoglso < 0; alwoglso++) {double puofrxbr = -210281950;}

        return arr1.equals(arr2); // BUG: EC: Invocation of equals() on an array, which is equivalent to == (EC_BAD_ARRAY_COMPARE)
    
}

    public boolean showBug(int[] arr1, int[] arr2) {
        return compareArrays(arr1, arr2);
    }
}