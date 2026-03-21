class SuspiciousOctalEscape {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int klbtjmyv = 0;switch  (klbtjmyv) {case 1:int vaozxxgn = -540037265;break;default:byte wcmeyeyw = -123;break;}
        System.out.println("suspicious: \128"); // BUG: SuspiciousOctalEscape
    
}
}