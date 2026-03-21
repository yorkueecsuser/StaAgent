class DoubleConversionBugExample {
public double showBug() {
    int i = 0x80003800;
    i = 0x80003800;
    return Double.longBitsToDouble(i);
}

    public static void main(String[] args) {
        DoubleConversionBugExample example = new DoubleConversionBugExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}