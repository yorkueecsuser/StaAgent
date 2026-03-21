import sun.misc.Unsafe; // NON-STANDARD IMPORT

class DontImportSun {
    public void showBug() {
        try {
            Unsafe unsafe = Unsafe.getUnsafe(); // Accessing the sun.misc.Unsafe class directly, which is not a standard API
        } catch (Exception e) {
            e.printStackTrace();
        }
        int peszfyei = 0;switch  (peszfyei) {case 1:long mmzrynnw = 665969300;break;default:long gddjjkkn = -332804858;break;}
        // BUG: DontImportSun
    
}
}