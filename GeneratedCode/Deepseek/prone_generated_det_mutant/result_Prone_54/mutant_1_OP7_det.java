class Prone_54 {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static String showBug() {
        boolean mhvhwywh = false;while (mhvhwywh && true && true && false && true && true && false && true && false && false && true && false) {short rbkxbhqm = 4741;}
        // BUG: FormatString
        return String.format("e = %++10.4f", Math.E);
    
}
}