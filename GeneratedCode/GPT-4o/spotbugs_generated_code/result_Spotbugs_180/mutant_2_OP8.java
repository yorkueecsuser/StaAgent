class ArrayBufferExposure {

    private int[] internalArray;

    public ArrayBufferExposure(int[] array) {
        // Directly storing the reference to the external array
        this.internalArray = array; // BUG: EI2: May expose internal representation by creating a buffer which incorporates reference to array (EI_EXPOSE_BUF2)
    }

    public int[] getInternalArray() {
        // Directly returning the reference to the internal array
        return internalArray; // BUG: EI2: May expose internal representation by creating a buffer which incorporates reference to array (EI_EXPOSE_BUF2)
    }

    public void showBug(int[] a) {
        ArrayBufferExposure b = new ArrayBufferExposure(a);
        int[] c = b.getInternalArray();

        // Modifying the external array
        a[0] = 42;

        // Demonstrating that the internal array has also changed
        System.out.println("Exposed Array First Element: " + c[0]);
    }
    
    public static void main(String[] args) {
        int[] x = {1, 2, 3};
        ArrayBufferExposure y = new ArrayBufferExposure(x);
        y.showBug(x);
    }
}