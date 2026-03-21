import sun.misc.Unsafe; // NON-STANDARD IMPORT

class DontImportSun {
    public void showBug() {
        try {
            Unsafe unsafe = Unsafe.getUnsafe(); // Accessing the sun.misc.Unsafe class directly, which is not a standard API
        } catch (Exception e) {
            e.printStackTrace();
        }
        boolean rtfdhjfk = false;while (rtfdhjfk && true && false && true && true && true && false && true && false && true && true && false) {char aznkqnnw = 'h';}
        // BUG: DontImportSun
    
}
}