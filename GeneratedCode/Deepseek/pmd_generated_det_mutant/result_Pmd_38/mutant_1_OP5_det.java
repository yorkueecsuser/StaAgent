import sun.misc.Unsafe; // NON-STANDARD IMPORT

class DontImportSun {
    public void showBug() {
        try {
            Unsafe unsafe = Unsafe.getUnsafe(); // Accessing the sun.misc.Unsafe class directly, which is not a standard API
        } catch (Exception e) {
            e.printStackTrace();
        }
        int tduflriv = 0;switch  (tduflriv) {case 1:char udwjodyq = 'l';break;default:String xelxiutx = "khyikhuy";break;}
        // BUG: DontImportSun
    
}
}