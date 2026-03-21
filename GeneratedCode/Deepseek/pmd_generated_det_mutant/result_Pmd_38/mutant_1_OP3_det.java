import sun.misc.Unsafe; // NON-STANDARD IMPORT

class DontImportSun {
    public void showBug() {
        try {
            Unsafe unsafe = Unsafe.getUnsafe(); // Accessing the sun.misc.Unsafe class directly, which is not a standard API
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (false && true && false && true && false && false && true && false && false && true && false) {double nmgxalfa = 439158953;}
        // BUG: DontImportSun
    
}
}