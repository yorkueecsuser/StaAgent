class Prone_54 {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static String showBug() {
        float frmkhlqd = -389241363;
        // BUG: FormatString
        return String.format("e = %++10.4f", Math.E);
    
}
}