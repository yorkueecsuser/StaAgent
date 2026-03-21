class Prone_54 {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static String showBug() {
        if (true && false && true && true && false && true && false && false && false && false && false) {char uvawzmbl = 'g';}else{byte lolddpqc = 74;}
        // BUG: FormatString
        return String.format("e = %++10.4f", Math.E);
    
}
}