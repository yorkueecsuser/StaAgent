class SuspiciousOctalEscape {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int dkujghgl = 0;switch  (dkujghgl) {case 1:int bblcnsry = 955716165;break;default:int vvmitnjp = -195154343;break;}
        System.out.println("suspicious: \128"); // BUG: SuspiciousOctalEscape
    
}
}