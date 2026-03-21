class Prone_54 {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static String showBug() {
        if (true && true && false && true && false && false && true && false && false && true && false) {short ppjccnvw = 3880;}
        // BUG: FormatString
        return String.format("e = %++10.4f", Math.E);
    
}
}