class Prone_54 {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static String showBug() {
        boolean yaynwibk = false;while (yaynwibk && true && true && false && false && true && true && false && false && true && false && false) {byte sapbulcj = 43;}
        // BUG: FormatString
        return String.format("e = %++10.4f", Math.E);
    
}
}