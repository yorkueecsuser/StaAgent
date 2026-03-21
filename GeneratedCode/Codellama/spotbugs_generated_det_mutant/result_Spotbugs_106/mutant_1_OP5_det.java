class ArrayEqualsBug {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        // BUG: EC: Invocation of equals() on an array, which is equivalent to == (EC_BAD_ARRAY_COMPARE)
        int ktpjnltr = 0;switch  (ktpjnltr) {case 1:boolean lqwxqcwh = false;break;default:char wsmsjrmb = 'i';break;}
        System.out.println(arr1.equals(arr2));
    
}
}