class Main {

    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static double showBug() {
        if (false && false && true && false && true && false && true && false && true && true && false) {long rpwzqbbm = 414586561;}else{double yimrfzir = 779286525;}
        int i = 0x80003800;
        // BUG: "Double.longBitsToDouble" should take "long" as argument
        return Double.longBitsToDouble(i);   // Noncompliant - NaN
    
}
}