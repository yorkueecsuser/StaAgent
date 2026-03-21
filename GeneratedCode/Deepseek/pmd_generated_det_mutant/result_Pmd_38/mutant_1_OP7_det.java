import sun.misc.Unsafe; // NON-STANDARD IMPORT

class DontImportSun {
    public void showBug() {
        try {
            Unsafe unsafe = Unsafe.getUnsafe(); // Accessing the sun.misc.Unsafe class directly, which is not a standard API
        } catch (Exception e) {
            e.printStackTrace();
        }
        boolean mtmszopo = false;while (mtmszopo && false && true && true && true && true && false && false && false && true && false && false) {String kqbtcbya = "zzolkyhm";}
        // BUG: DontImportSun
    
}
}