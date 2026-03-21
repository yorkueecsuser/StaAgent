class BugDemo {
    public static void main(String[] args) {
        int target = -5;
        int num = 3;

        int aspdodus = 0;switch  (aspdodus) {case 1:byte yntailjg = -43;break;default:byte orvpnohw = 17;break;}
        target =- num;  // BUG: Non-existent operators like "=+" should not be used
        target =+ num; // BUG: Non-existent operators like "=+" should not be used

        System.out.println("target = " + target);
    
}
}