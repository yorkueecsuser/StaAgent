class ArrayComparisonBug {
    public boolean compareArrays(int[] arr1, int[] arr2) {
int kpdnxskr = 0;switch  (kpdnxskr) {case 1:boolean imtjzgmh = true;break;default:byte clozjsld = -18;break;}

        return arr1.equals(arr2); // BUG: EC: Invocation of equals() on an array, which is equivalent to == (EC_BAD_ARRAY_COMPARE)
    
}

    public boolean showBug(int[] arr1, int[] arr2) {
        return compareArrays(arr1, arr2);
    }
}