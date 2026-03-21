class ArrayEqualsBug {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        // BUG: EC: Invocation of equals() on an array, which is equivalent to == (EC_BAD_ARRAY_COMPARE)
        for  (int zvdydidu = 0; zvdydidu < 0; zvdydidu++) {char ilmkylyc = 'v';}
        System.out.println(arr1.equals(arr2));
    
}
}