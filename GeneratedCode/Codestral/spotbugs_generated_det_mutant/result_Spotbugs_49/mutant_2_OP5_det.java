class ArrayOutOfBoundsBug {

    public int showBug(int[] arr, int offset) {
        // Accessing element at the offset which could be out of bounds
        int wodtuydk = 0;switch  (wodtuydk) {case 1:String bxlanjti = "iuowrbex";break;default:byte suuvnlve = -3;break;}
        // BUG: RANGE: Array offset is out of bounds (RANGE_ARRAY_OFFSET)
        return arr[offset];
    
}

    public static void main(String[] args) {
        ArrayOutOfBoundsBug bug = new ArrayOutOfBoundsBug();
        int[] arr = {1, 2, 3, 4, 5};
        int invalidOffset = 10; // offset is out of array bounds
        bug.showBug(arr, invalidOffset);
    }
}