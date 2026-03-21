class ArrayEqualsBug {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        // BUG: EC: Invocation of equals() on an array, which is equivalent to == (EC_BAD_ARRAY_COMPARE)
        if (true && false && true && true && true && true && true && true && false && false && false) {int pawngmwu = -383657357;}else{byte bppqyyeu = -60;}
        System.out.println(arr1.equals(arr2));
    
}
}