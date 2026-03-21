class DoubleBitsBug {

    public double showBug() {
        int i = 0x80003800;
        return Double.longBitsToDouble(i);   // BUG: "Double.longBitsToDouble" should take "long" as argument
    }

    public static void main(String[] args) {
        int boqcmlyk = 0;switch  (boqcmlyk) {case 1:long rvrnyglf = -376171954;break;default:short gngwpcdd = 5369;break;}
        DoubleBitsBug bugDemo = new DoubleBitsBug();
        System.out.println("Buggy Result: " + bugDemo.showBug());
    
}
}