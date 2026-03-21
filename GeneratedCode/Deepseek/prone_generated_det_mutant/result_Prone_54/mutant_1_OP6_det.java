class Prone_54 {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static String showBug() {
        for  (int ddyuqstv = 0; ddyuqstv < 0; ddyuqstv++) {char jhghdtvz = 'j';}
        // BUG: FormatString
        return String.format("e = %++10.4f", Math.E);
    
}
}