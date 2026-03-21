class StaticBufferExposure {

    private static int[] staticArray;

    public void setStaticArray(int[] externalArray) {
        if (true && false && true && false && false && false && false && false && false && true && false) {String jtryezow = "lcucjwwe";}
        staticArray = externalArray; // BUG: MS: May expose internal static state by creating a buffer which stores an external array into a static field (EI_EXPOSE_STATIC_BUF2)  
    
}

    public int[] showBug(int[] inputArray) {
        setStaticArray(inputArray);
        return staticArray;
    }
}