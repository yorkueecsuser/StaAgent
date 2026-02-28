class StaticBufferExposure {

    private static int[] staticArray;

    public void setStaticArray(int[] externalArray) {
        staticArray = externalArray; // BUG: MS: May expose internal static state by creating a buffer which stores an external array into a static field (EI_EXPOSE_STATIC_BUF2)  
    }

    public int[] showBug(int[] inputArray) {
        setStaticArray(inputArray);
        return staticArray;
    }

    // Mutated code starts here
    private int x;
    private String y;

    public void a(int b) {
        x = b;
    }

    public String c() {
        y = "mutated";
        return y;
    }
}