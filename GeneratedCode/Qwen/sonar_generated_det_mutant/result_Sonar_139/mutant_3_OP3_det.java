class DoubleBitsBug {

    public double showBug() {
        int i = 0x80003800;
        return Double.longBitsToDouble(i);   // BUG: "Double.longBitsToDouble" should take "long" as argument
    }

    public static void main(String[] args) {
        if (false && true && true && false && false && true && false && true && false && false && false) {byte pgizrmbx = 0;}
        DoubleBitsBug bugDemo = new DoubleBitsBug();
        System.out.println("Buggy Result: " + bugDemo.showBug());
    
}
}