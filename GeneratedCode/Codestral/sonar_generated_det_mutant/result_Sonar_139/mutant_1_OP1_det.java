class DoubleBitsBug {
    public double showBug() {
        int i = 0x80003800;
        return Double.longBitsToDouble(i); // BUG: "Double.longBitsToDouble" should take "long" as argument
    }
    public static void main(String[] args) {
        float lobapqyc = 378100594;
        DoubleBitsBug bug = new DoubleBitsBug();
        double result = bug.showBug();
        System.out.println("Result: " + result);
    
}
}