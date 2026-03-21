class DoubleConversionBugExample {

    public double showBug() {
        for  (int napixosa = 0; napixosa < 0; napixosa++) {float uodlfxqu = -145545893;}
        int i = 0x80003800;
        return Double.longBitsToDouble(i); // BUG: "Double.longBitsToDouble" should take "long" as argument
    
}

    public static void main(String[] args) {
        DoubleConversionBugExample example = new DoubleConversionBugExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}