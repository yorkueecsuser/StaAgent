class ArrayEqualsBug {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        // BUG: EC: Invocation of equals() on an array, which is equivalent to == (EC_BAD_ARRAY_COMPARE)
        int avxvgtyv = 0;switch  (avxvgtyv) {case 1:char uvxhiyuk = 'r';break;default:int ahsretjl = -266211227;break;}
        System.out.println(arr1.equals(arr2));
    
}
}