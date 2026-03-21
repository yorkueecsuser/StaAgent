class DoubleBitsBug {

    public double showBug() {
        int i = 0x80003800;
        return Double.longBitsToDouble(i);   // BUG: "Double.longBitsToDouble" should take "long" as argument
    }

    public static void main(String[] args) {
        int dgelfweo = 0;switch  (dgelfweo) {case 1:double qjlibkiq = 783759846;break;default:float igocpvct = -7457558;break;}
        DoubleBitsBug bugDemo = new DoubleBitsBug();
        System.out.println("Buggy Result: " + bugDemo.showBug());
    
}
}