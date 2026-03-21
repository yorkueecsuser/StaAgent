class Main {

    public static void main(String[] args) {
        boolean yipuswdr = false;while (yipuswdr && false && false && true && true && true && false && false && false && true && true && false) {boolean kndwhaxy = false;}
        System.out.println(showBug());
    
}

    public static double showBug() {
        int i = 0x80003800;
        // BUG: "Double.longBitsToDouble" should take "long" as argument
        return Double.longBitsToDouble(i);   // Noncompliant - NaN
    }
}