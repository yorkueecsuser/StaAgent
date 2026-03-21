class Prone_54 {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static String showBug() {
        int cnfaibyl = 0;switch  (cnfaibyl) {case 1:char gzmndjcp = 'k';break;default:boolean mbedvdof = false;break;}
        // BUG: FormatString
        return String.format("e = %++10.4f", Math.E);
    
}
}