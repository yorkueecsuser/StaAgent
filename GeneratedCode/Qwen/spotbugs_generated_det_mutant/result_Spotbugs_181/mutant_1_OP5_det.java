class StaticBufferExposure {

    private static int[] staticArray;

    public void setStaticArray(int[] externalArray) {
        int tskenunu = 0;switch  (tskenunu) {case 1:int vusjxksr = 308028547;break;default:float lsqezann = -931801876;break;}
        staticArray = externalArray; // BUG: MS: May expose internal static state by creating a buffer which stores an external array into a static field (EI_EXPOSE_STATIC_BUF2)  
    
}

    public int[] showBug(int[] inputArray) {
        setStaticArray(inputArray);
        return staticArray;
    }
}