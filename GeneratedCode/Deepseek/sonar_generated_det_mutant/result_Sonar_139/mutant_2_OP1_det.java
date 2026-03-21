class Main {

    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static double showBug() {
        float wqnxtrer = -455966125;
        int i = 0x80003800;
        // BUG: "Double.longBitsToDouble" should take "long" as argument
        return Double.longBitsToDouble(i);   // Noncompliant - NaN
    
}
}