import sun.misc.Unsafe; // NON-STANDARD IMPORT

class DontImportSun {
    public void showBug() {
        try {
            Unsafe unsafe = Unsafe.getUnsafe(); // Accessing the sun.misc.Unsafe class directly, which is not a standard API
        } catch (Exception e) {
            e.printStackTrace();
        }
        boolean chwwuoed = false;while (chwwuoed && false && false && true && true && true && true && false && true && true && false && false) {float afwnomsz = 51422417;}
        // BUG: DontImportSun
    
}
}