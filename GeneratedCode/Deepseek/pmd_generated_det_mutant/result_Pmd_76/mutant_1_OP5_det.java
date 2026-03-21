class SuspiciousOctalEscape {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int lzvfnjza = 0;switch  (lzvfnjza) {case 1:char kbjdsxwx = 'q';break;default:String zxwmrtrk = "dxrpylen";break;}
        System.out.println("suspicious: \128"); // BUG: SuspiciousOctalEscape
    
}
}