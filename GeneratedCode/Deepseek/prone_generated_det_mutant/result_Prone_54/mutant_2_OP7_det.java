class Prone_54 {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static String showBug() {
        boolean mljhvlto = false;while (mljhvlto && false && false && true && true && false && false && false && true && true && false && false) {double ertfogyr = 623164900;}
        // BUG: FormatString
        return String.format("e = %++10.4f", Math.E);
    
}
}