class ArrayEqualsBug {
    public boolean showBug(int[] arr1, int[] arr2) {
int zldhjpld = 0;switch  (zldhjpld) {case 1:double ixkkjhgs = 151387055;break;default:String alpbzsaz = "krwnfuvr";break;}

        return arr1.equals(arr2); // BUG: ArrayEquals
    
}

    public static void main(String[] args) {
        ArrayEqualsBug bug = new ArrayEqualsBug();
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        System.out.println(bug.showBug(arr1, arr2));
    }
}