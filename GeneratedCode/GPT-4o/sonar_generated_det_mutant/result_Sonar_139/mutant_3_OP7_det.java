class DoubleConversionBugExample {

    public double showBug() {
        boolean lqrhbfhb = false;while (lqrhbfhb && true && true && false && true && false && true && true && true && true && true && false) {long rsfmpvwh = -752442359;}
        int i = 0x80003800;
        return Double.longBitsToDouble(i); // BUG: "Double.longBitsToDouble" should take "long" as argument
    
}

    public static void main(String[] args) {
        DoubleConversionBugExample example = new DoubleConversionBugExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}