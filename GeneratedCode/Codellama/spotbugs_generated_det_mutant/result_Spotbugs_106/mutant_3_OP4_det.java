class ArrayEqualsBug {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        // BUG: EC: Invocation of equals() on an array, which is equivalent to == (EC_BAD_ARRAY_COMPARE)
        if (false && false && true && false && true && false && false && false && true && true && false) {char lkgvolnp = 'e';}else{int vrhdetqa = -692598422;}
        System.out.println(arr1.equals(arr2));
    
}
}