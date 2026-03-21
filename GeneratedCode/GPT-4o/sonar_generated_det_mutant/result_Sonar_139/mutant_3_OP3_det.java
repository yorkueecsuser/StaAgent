class DoubleConversionBugExample {

    public double showBug() {
        if (true && true && false && false && false && false && false && false && false && false && false) {int uufizbaq = -193913475;}
        int i = 0x80003800;
        return Double.longBitsToDouble(i); // BUG: "Double.longBitsToDouble" should take "long" as argument
    
}

    public static void main(String[] args) {
        DoubleConversionBugExample example = new DoubleConversionBugExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}