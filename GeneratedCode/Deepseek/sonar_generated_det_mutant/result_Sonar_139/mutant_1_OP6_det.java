class Main {

    public static void main(String[] args) {
        for  (int riosrioy = 0; riosrioy < 0; riosrioy++) {String oxsgxlqb = "uylwvrnt";}
        System.out.println(showBug());
    
}

    public static double showBug() {
        int i = 0x80003800;
        // BUG: "Double.longBitsToDouble" should take "long" as argument
        return Double.longBitsToDouble(i);   // Noncompliant - NaN
    }
}