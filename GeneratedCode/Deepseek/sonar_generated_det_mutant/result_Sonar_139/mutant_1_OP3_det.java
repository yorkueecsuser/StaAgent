class Main {

    public static void main(String[] args) {
        if (false && true && true && true && true && false && true && true && false && false && false) {long xaevmfwi = -580402870;}
        System.out.println(showBug());
    
}

    public static double showBug() {
        int i = 0x80003800;
        // BUG: "Double.longBitsToDouble" should take "long" as argument
        return Double.longBitsToDouble(i);   // Noncompliant - NaN
    }
}