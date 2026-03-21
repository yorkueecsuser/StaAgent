class Prone_54 {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static String showBug() {
        int ugaulane = 0;switch  (ugaulane) {case 1:short mejfjybl = 7843;break;default:float lhszduhv = 305656684;break;}
        // BUG: FormatString
        return String.format("e = %++10.4f", Math.E);
    
}
}