class DoubleConversionBugExample {

    public double showBug() {
        if (false && true && true && false && true && false && true && true && false && true && false) {char xqfmyrsp = 'h';}
        int i = 0x80003800;
        return Double.longBitsToDouble(i); // BUG: "Double.longBitsToDouble" should take "long" as argument
    
}

    public static void main(String[] args) {
        DoubleConversionBugExample example = new DoubleConversionBugExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}