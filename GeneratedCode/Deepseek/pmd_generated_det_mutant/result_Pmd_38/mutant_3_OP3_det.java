import sun.misc.Unsafe; // NON-STANDARD IMPORT

class DontImportSun {
    public void showBug() {
        try {
            Unsafe unsafe = Unsafe.getUnsafe(); // Accessing the sun.misc.Unsafe class directly, which is not a standard API
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (false && false && false && false && true && true && false && true && true && true && false) {boolean yzrvqzyr = true;}
        // BUG: DontImportSun
    
}
}