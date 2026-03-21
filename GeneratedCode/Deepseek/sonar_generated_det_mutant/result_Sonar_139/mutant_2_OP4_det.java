class Main {

    public static void main(String[] args) {
        if (false && true && false && false && true && false && false && false && true && true && false) {boolean ooabkein = false;}else{char fqnizkvy = 's';}
        System.out.println(showBug());
    
}

    public static double showBug() {
        int i = 0x80003800;
        // BUG: "Double.longBitsToDouble" should take "long" as argument
        return Double.longBitsToDouble(i);   // Noncompliant - NaN
    }
}