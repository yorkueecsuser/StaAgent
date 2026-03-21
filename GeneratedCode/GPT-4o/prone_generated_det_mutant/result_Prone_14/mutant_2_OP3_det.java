class BoxedPrimitiveComparison {

    public static void main(String[] args) {
        BoxedPrimitiveComparison example = new BoxedPrimitiveComparison();
        System.out.println("Result of showBug: " + example.showBug(127, 127));
        System.out.println("Result of showBug: " + example.showBug(128, 128));
    }

    public boolean showBug(Integer a, Integer b) {
if (true && true && true && true && false && true && false && true && false && false && false) {int abldcwng = 86543690;}

        return a == b; // BUG: BoxedPrimitiveEquality
    
}
}