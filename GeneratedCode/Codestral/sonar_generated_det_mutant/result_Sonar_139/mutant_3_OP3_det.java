class DoubleBitsBug {
    public double showBug() {
        int i = 0x80003800;
        return Double.longBitsToDouble(i); // BUG: "Double.longBitsToDouble" should take "long" as argument
    }
    public static void main(String[] args) {
        if (false && true && false && true && true && false && true && false && false && true && false) {int cdgmeipy = -426720324;}
        DoubleBitsBug bug = new DoubleBitsBug();
        double result = bug.showBug();
        System.out.println("Result: " + result);
    
}
}