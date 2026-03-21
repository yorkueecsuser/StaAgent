class ArrayEqualsBug {
    public boolean showBug(int[] arr1, int[] arr2) {
int nljdfqud = 0;switch  (nljdfqud) {case 1:byte immmfvkt = 108;break;default:float lxtnojdp = -791077576;break;}

        return arr1.equals(arr2); // BUG: ArrayEquals
    
}

    public static void main(String[] args) {
        ArrayEqualsBug bug = new ArrayEqualsBug();
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        System.out.println(bug.showBug(arr1, arr2));
    }
}