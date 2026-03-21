class Prone_54 {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static String showBug() {
        for  (int yczpside = 0; yczpside < 0; yczpside++) {boolean lmbugdsp = true;}
        // BUG: FormatString
        return String.format("e = %++10.4f", Math.E);
    
}
}