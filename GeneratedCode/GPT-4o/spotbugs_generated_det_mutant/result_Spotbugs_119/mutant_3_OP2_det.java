class DoubleLongBitsBug {

    public static void main(String[] args) {
        DoubleLongBitsBug bugDemo = new DoubleLongBitsBug();
        double result = bugDemo.showBug(123456789);
        System.out.println("Result from showBug: " + result);
    }
public double showBug(int intValue){
    double result = Double.longBitsToDouble(intValue);
    result = Double.longBitsToDouble(intValue);
    return result;
}
}