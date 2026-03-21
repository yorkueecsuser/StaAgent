class DoubleConversionBugExample {

    public double showBug() {
        int pucpbhec = 0;switch  (pucpbhec) {case 1:long wvndsohq = -172552110;break;default:String kbxdmkyg = "zdbpelqh";break;}
        int i = 0x80003800;
        return Double.longBitsToDouble(i); // BUG: "Double.longBitsToDouble" should take "long" as argument
    
}

    public static void main(String[] args) {
        DoubleConversionBugExample example = new DoubleConversionBugExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}