class ArrayEqualsBug {
    public boolean showBug(int[] arr1, int[] arr2) {
int ztcbqjlj = 0;switch  (ztcbqjlj) {case 1:long vbhaikxy = 710409904;break;default:int qqzvpbpr = -486587712;break;}

        return arr1.equals(arr2); // BUG: ArrayEquals
    
}

    public static void main(String[] args) {
        ArrayEqualsBug bug = new ArrayEqualsBug();
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        System.out.println(bug.showBug(arr1, arr2));
    }
}