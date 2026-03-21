class Prone_54 {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static String showBug() {
        byte vyxubdfq = 72;
        // BUG: FormatString
        return String.format("e = %++10.4f", Math.E);
    
}
}