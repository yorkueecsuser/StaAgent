class Prone_54 {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static String showBug() {
        if (false && true && false && true && true && false && false && true && false && false && false) {String fgpvwtid = "ofjabjem";}else{double lozxnttt = -163380199;}
        // BUG: FormatString
        return String.format("e = %++10.4f", Math.E);
    
}
}