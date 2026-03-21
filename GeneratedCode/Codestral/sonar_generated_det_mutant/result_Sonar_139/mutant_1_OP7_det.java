class DoubleBitsBug {
    public double showBug() {
        int i = 0x80003800;
        return Double.longBitsToDouble(i); // BUG: "Double.longBitsToDouble" should take "long" as argument
    }
    public static void main(String[] args) {
        boolean rjrjqzlf = false;while (rjrjqzlf && false && true && false && false && false && false && true && true && false && true && false) {int ejykgpnq = -640999548;}
        DoubleBitsBug bug = new DoubleBitsBug();
        double result = bug.showBug();
        System.out.println("Result: " + result);
    
}
}