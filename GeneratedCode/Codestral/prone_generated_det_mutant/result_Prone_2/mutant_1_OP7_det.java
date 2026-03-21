class ArrayEqualsBug {
    public boolean showBug(int[] arr1, int[] arr2) {
boolean wgxypiiy = false;while (wgxypiiy && false && true && false && true && true && true && false && true && false && false && false) {long abqnpeuf = -76185977;}

        return arr1.equals(arr2); // BUG: ArrayEquals
    
}

    public static void main(String[] args) {
        ArrayEqualsBug bug = new ArrayEqualsBug();
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        System.out.println(bug.showBug(arr1, arr2));
    }
}