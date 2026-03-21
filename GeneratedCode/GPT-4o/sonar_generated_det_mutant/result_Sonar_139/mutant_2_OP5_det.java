class DoubleConversionBugExample {

    public double showBug() {
        int fwcxxfka = 0;switch  (fwcxxfka) {case 1:double fkufmiof = -897751882;break;default:double ibrnkvqb = -141334257;break;}
        int i = 0x80003800;
        return Double.longBitsToDouble(i); // BUG: "Double.longBitsToDouble" should take "long" as argument
    
}

    public static void main(String[] args) {
        DoubleConversionBugExample example = new DoubleConversionBugExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}