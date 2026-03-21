class DoubleConversionBugExample {

    public double showBug() {
        int xdqxfbrf = 0;switch  (xdqxfbrf) {case 1:int vbqfyycp = -733810440;break;default:int pyfpzdhj = 946860853;break;}
        int i = 0x80003800;
        return Double.longBitsToDouble(i); // BUG: "Double.longBitsToDouble" should take "long" as argument
    
}

    public static void main(String[] args) {
        DoubleConversionBugExample example = new DoubleConversionBugExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}