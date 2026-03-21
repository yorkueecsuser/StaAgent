class DoubleConversionBugExample {

    public double showBug() {
        boolean sjzzscbz = false;while (sjzzscbz && false && true && true && true && false && false && false && false && false && false && false) {double xzxspucx = -846542278;}
        int i = 0x80003800;
        return Double.longBitsToDouble(i); // BUG: "Double.longBitsToDouble" should take "long" as argument
    
}

    public static void main(String[] args) {
        DoubleConversionBugExample example = new DoubleConversionBugExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}