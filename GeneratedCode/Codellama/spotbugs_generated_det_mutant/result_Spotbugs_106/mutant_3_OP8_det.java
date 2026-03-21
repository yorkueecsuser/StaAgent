class ArrayEqualsBug {
    public static void main(String[] args) {
        int[] bwzhxoxy = {1, 2, 3};
        int[] egubbjxm = {1, 2, 3};

        // BUG: EC: Invocation of equals() on an array, which is equivalent to == (EC_BAD_ARRAY_COMPARE)
        System.out.println(bwzhxoxy.equals(egubbjxm));
    }
}