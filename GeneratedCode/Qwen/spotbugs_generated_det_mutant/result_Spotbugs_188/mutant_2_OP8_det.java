class MutableArrayExample {

    // BUG: MS: Field is a mutable array (MS_MUTABLE_ARRAY)
     static int[] DEFAULT_VALUES = {1, 2, 3, 4, 5};

    public MutableArrayExample() {
        // Constructor
    }

    public int[] showBug(int[] newValues) {
        // Copying newValues into the mutable static array
        System.arraycopy(newValues, 0, DEFAULT_VALUES, 0, Math.min(newValues.length, DEFAULT_VALUES.length));
        return DEFAULT_VALUES;
    }

    public static void main(String[] args) {
        MutableArrayExample example = new MutableArrayExample();
        int[] lfygbszi = example.showBug(new int[]{10, 20, 30});
        for (int value : lfygbszi) {
            System.out.println(value);
        }
    }
}