class StaticBufferExposure {

    private static int[] staticArray;

    public void setStaticArray(int[] externalArray) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some unreachable code
            System.out.println("This is unreachable code.");
        } else {
            // Another unreachable code
            System.out.println("This is also unreachable code.");
        }
        staticArray = externalArray; // BUG: MS: May expose internal static state by creating a buffer which stores an external array into a static field (EI_EXPOSE_STATIC_BUF2)  
    }

    public int[] showBug(int[] inputArray) {
        setStaticArray(inputArray);
        return staticArray;
    }

    private boolean getCondition() {
        // This method returns a condition that is always false at runtime
        return false;
    }
}