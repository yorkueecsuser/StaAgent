import sun.misc.Unsafe; // NON-STANDARD IMPORT

class DontImportSun {
    public void showBug() {
        try {
            Unsafe unsafe = Unsafe.getUnsafe(); // Accessing the sun.misc.Unsafe class directly, which is not a standard API
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (true && true && true && false && true && true && true && true && true && false && false) {double jxwhfuqb = 893991737;}else{float blygafyd = 998861493;}
        // BUG: DontImportSun
    
}
}