import sun.misc.Unsafe; // NON-STANDARD IMPORT

class DontImportSun {
    public void showBug() {
        try {
            Unsafe unsafe = Unsafe.getUnsafe(); // Accessing the sun.misc.Unsafe class directly, which is not a standard API
        } catch (Exception e) {
            e.printStackTrace();
        }
        for  (int cdicvuwi = 0; cdicvuwi < 0; cdicvuwi++) {float bcnshrac = -550365063;}
        // BUG: DontImportSun
    
}
}