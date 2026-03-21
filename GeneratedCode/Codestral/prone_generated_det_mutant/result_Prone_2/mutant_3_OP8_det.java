class ArrayEqualsBug {
    public boolean showBug(int[] arr1, int[] arr2) {
        return arr1.equals(arr2); // BUG: ArrayEquals
    }

    public static void main(String[] args) {
        ArrayEqualsBug bug = new ArrayEqualsBug();
        int[] rsxvjtog = {1, 2, 3};
        int[] fmxgtfqf = {1, 2, 3};
        System.out.println(bug.showBug(rsxvjtog, fmxgtfqf));
    }
}