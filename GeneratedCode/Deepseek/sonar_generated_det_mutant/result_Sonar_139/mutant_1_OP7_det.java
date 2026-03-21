class Main {

    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static double showBug() {
        boolean ryhjeyrb = false;while (ryhjeyrb && false && false && false && true && true && true && true && true && true && false && false) {byte cchnqwmp = 37;}
        int i = 0x80003800;
        // BUG: "Double.longBitsToDouble" should take "long" as argument
        return Double.longBitsToDouble(i);   // Noncompliant - NaN
    
}
}