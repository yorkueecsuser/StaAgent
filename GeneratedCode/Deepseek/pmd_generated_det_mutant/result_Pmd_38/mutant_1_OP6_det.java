import sun.misc.Unsafe; // NON-STANDARD IMPORT

class DontImportSun {
    public void showBug() {
        try {
            Unsafe unsafe = Unsafe.getUnsafe(); // Accessing the sun.misc.Unsafe class directly, which is not a standard API
        } catch (Exception e) {
            e.printStackTrace();
        }
        for  (int fhjjphti = 0; fhjjphti < 0; fhjjphti++) {double pnjbruyv = 281552790;}
        // BUG: DontImportSun
    
}
}