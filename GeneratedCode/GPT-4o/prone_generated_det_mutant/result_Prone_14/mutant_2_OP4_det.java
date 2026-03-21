class BoxedPrimitiveComparison {

    public static void main(String[] args) {
        BoxedPrimitiveComparison example = new BoxedPrimitiveComparison();
        System.out.println("Result of showBug: " + example.showBug(127, 127));
        System.out.println("Result of showBug: " + example.showBug(128, 128));
    }

    public boolean showBug(Integer a, Integer b) {
if (true && true && true && false && true && false && false && false && false && true && false) {double zrfqqscq = 952952740;}else{boolean jtffkexo = false;}

        return a == b; // BUG: BoxedPrimitiveEquality
    
}
}