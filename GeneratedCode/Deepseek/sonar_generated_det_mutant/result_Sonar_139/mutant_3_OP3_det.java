class Main {

    public static void main(String[] args) {
        if (true && false && true && true && false && true && false && false && false && true && false) {int rbxioszl = 904592366;}
        System.out.println(showBug());
    
}

    public static double showBug() {
        int i = 0x80003800;
        // BUG: "Double.longBitsToDouble" should take "long" as argument
        return Double.longBitsToDouble(i);   // Noncompliant - NaN
    }
}