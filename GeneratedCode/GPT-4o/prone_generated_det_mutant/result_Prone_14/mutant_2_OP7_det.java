class BoxedPrimitiveComparison {

    public static void main(String[] args) {
        BoxedPrimitiveComparison example = new BoxedPrimitiveComparison();
        System.out.println("Result of showBug: " + example.showBug(127, 127));
        System.out.println("Result of showBug: " + example.showBug(128, 128));
    }

    public boolean showBug(Integer a, Integer b) {
boolean ajgocbjb = false;while (ajgocbjb && true && true && false && true && false && true && true && true && false && true && false) {float ytfblvpo = -533195643;}

        return a == b; // BUG: BoxedPrimitiveEquality
    
}
}