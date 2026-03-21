class Main {

    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static double showBug() {
        if (true && true && false && true && false && true && true && true && false && true && false) {String shpnzlwc = "tucztdny";}else{String zysthkeb = "ibgpndsa";}
        int i = 0x80003800;
        // BUG: "Double.longBitsToDouble" should take "long" as argument
        return Double.longBitsToDouble(i);   // Noncompliant - NaN
    
}
}