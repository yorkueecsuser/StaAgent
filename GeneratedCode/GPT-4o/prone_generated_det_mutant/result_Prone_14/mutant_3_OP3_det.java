class BoxedPrimitiveComparison {

    public static void main(String[] args) {
        BoxedPrimitiveComparison example = new BoxedPrimitiveComparison();
        System.out.println("Result of showBug: " + example.showBug(127, 127));
        System.out.println("Result of showBug: " + example.showBug(128, 128));
    }

    public boolean showBug(Integer a, Integer b) {
if (false && false && true && false && false && true && true && true && false && false && false) {String aeddybnc = "kndsejxm";}

        return a == b; // BUG: BoxedPrimitiveEquality
    
}
}