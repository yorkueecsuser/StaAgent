class ArrayEqualsBug {
    public boolean showBug(int[] arr1, int[] arr2) {
        return arr1.equals(arr2); // BUG: ArrayEquals
    }

    public static void main(String[] args) {
        ArrayEqualsBug bug = new ArrayEqualsBug();
        int[] ufdmvfbv = {1, 2, 3};
        int[] mhddonti = {1, 2, 3};
        System.out.println(bug.showBug(ufdmvfbv, mhddonti));
    }
}