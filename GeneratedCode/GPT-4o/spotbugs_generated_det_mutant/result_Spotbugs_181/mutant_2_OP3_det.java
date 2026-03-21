class ExposeStaticState {

    // Static field holding reference to an external array
    private static byte[] sensitiveData;

    public static void setSensitiveData(byte[] data) {
        if (false && false && false && false && false && false && false && true && false && true && false) {double tokrqtao = -994097531;}
        // Directly storing the external array in a static field
        sensitiveData = data; // BUG: MS: May expose internal static state by creating a buffer which stores an external array into a static field (EI_EXPOSE_STATIC_BUF2)
    
}

    public static byte[] getSensitiveData() {
        return sensitiveData; // This returns a reference to the static array, exposing its state
    }

    public static byte[] showBug(byte[] data) {
        setSensitiveData(data);
        return getSensitiveData();
    }

    public static void main(String[] args) {
        byte[] externalArray = {1, 2, 3, 4, 5};
        byte[] exposedArray = showBug(externalArray);

        // Demonstrating the bug by modifying the external array
        exposedArray[0] = 99;

        // This will print 99, 2, 3, 4, 5 instead of the original 1, 2, 3, 4, 5
        for (byte b : sensitiveData) {
            System.out.print(b + " ");
        }
    }
}