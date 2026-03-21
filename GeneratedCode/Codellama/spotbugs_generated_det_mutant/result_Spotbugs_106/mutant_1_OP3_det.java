class ArrayEqualsBug {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        // BUG: EC: Invocation of equals() on an array, which is equivalent to == (EC_BAD_ARRAY_COMPARE)
        if (true && false && false && true && true && false && true && false && true && false && false) {float srsjeixu = 790158691;}
        System.out.println(arr1.equals(arr2));
    
}
}