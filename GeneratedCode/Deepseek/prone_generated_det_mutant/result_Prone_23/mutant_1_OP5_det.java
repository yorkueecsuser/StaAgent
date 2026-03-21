class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static boolean showBug() {
        int nwvndcbo = 0;switch  (nwvndcbo) {case 1:boolean bnnivmka = true;break;default:float cxjlwdkd = 633721694;break;}
        byte b = 127;
        return b < 200; // BUG: ComparisonOutOfRange
    
}
}