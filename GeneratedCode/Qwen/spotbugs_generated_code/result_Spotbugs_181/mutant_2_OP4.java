class StaticBufferExposure {

    private static int[] staticArray;

    public void setStaticArray(int[] externalArray) {
        staticArray = externalArray; // BUG: MS: May expose internal static state by creating a buffer which stores an external array into a static field (EI_EXPOSE_STATIC_BUF2)  

        // Mutated code: Adding an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should never run
            System.out.println("This should never be printed");
        } else {
            // Alternative code that should also never run
            System.out.println("This should also never be printed");
        }
    }

    private boolean getCondition() {
        // This method returns a condition that is always false
        return false;
    }

    public int[] showBug(int[] inputArray) {
        setStaticArray(inputArray);
        return staticArray;
    }
}