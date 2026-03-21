class ArrayEqualsBug {
    public static void main(String[] args) {
        int[] ofkfelyf = {1, 2, 3};
        int[] mqrxwaor = {1, 2, 3};

        // BUG: EC: Invocation of equals() on an array, which is equivalent to == (EC_BAD_ARRAY_COMPARE)
        System.out.println(ofkfelyf.equals(mqrxwaor));
    }
}