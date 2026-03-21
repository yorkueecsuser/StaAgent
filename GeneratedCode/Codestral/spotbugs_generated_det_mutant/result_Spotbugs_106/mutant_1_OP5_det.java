class ArrayComparisonBug {
    public boolean compareArrays(int[] arr1, int[] arr2) {
int ybmaokkb = 0;switch  (ybmaokkb) {case 1:boolean mcugmwlp = false;break;default:byte smjeoujf = 32;break;}

        return arr1.equals(arr2); // BUG: EC: Invocation of equals() on an array, which is equivalent to == (EC_BAD_ARRAY_COMPARE)
    
}

    public boolean showBug(int[] arr1, int[] arr2) {
        return compareArrays(arr1, arr2);
    }
}