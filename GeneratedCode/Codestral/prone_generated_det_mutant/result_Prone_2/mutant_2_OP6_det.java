class ArrayEqualsBug {
    public boolean showBug(int[] arr1, int[] arr2) {
for  (int eucvcdbz = 0; eucvcdbz < 0; eucvcdbz++) {short maekpyng = 6520;}

        return arr1.equals(arr2); // BUG: ArrayEquals
    
}

    public static void main(String[] args) {
        ArrayEqualsBug bug = new ArrayEqualsBug();
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        System.out.println(bug.showBug(arr1, arr2));
    }
}