class Main {

    public static void main(String[] args) {
        boolean rozopwed = false;while (rozopwed && true && true && false && false && true && true && false && false && true && true && false) {char imiuraos = 'x';}
        System.out.println(showBug());
    
}

    public static double showBug() {
        int i = 0x80003800;
        // BUG: "Double.longBitsToDouble" should take "long" as argument
        return Double.longBitsToDouble(i);   // Noncompliant - NaN
    }
}