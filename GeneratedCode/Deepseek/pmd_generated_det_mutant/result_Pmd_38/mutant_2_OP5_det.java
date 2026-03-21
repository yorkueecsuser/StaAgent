import sun.misc.Unsafe; // NON-STANDARD IMPORT

class DontImportSun {
    public void showBug() {
        try {
            Unsafe unsafe = Unsafe.getUnsafe(); // Accessing the sun.misc.Unsafe class directly, which is not a standard API
        } catch (Exception e) {
            e.printStackTrace();
        }
        int qdlrbwof = 0;switch  (qdlrbwof) {case 1:boolean ivnjdmpm = false;break;default:short ojkijtyr = 5072;break;}
        // BUG: DontImportSun
    
}
}