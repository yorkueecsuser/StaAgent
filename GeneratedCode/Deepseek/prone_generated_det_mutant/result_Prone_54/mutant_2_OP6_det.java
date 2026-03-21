class Prone_54 {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static String showBug() {
        for  (int ogxqmuki = 0; ogxqmuki < 0; ogxqmuki++) {byte gjltwbku = -67;}
        // BUG: FormatString
        return String.format("e = %++10.4f", Math.E);
    
}
}