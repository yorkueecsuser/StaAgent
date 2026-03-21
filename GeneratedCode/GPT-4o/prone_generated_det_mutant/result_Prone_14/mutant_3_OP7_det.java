class BoxedPrimitiveComparison {

    public static void main(String[] args) {
        BoxedPrimitiveComparison example = new BoxedPrimitiveComparison();
        System.out.println("Result of showBug: " + example.showBug(127, 127));
        System.out.println("Result of showBug: " + example.showBug(128, 128));
    }

    public boolean showBug(Integer a, Integer b) {
boolean ozjguffl = false;while (ozjguffl && false && true && false && false && true && false && false && true && true && false && false) {float qbxvmupo = 843376188;}

        return a == b; // BUG: BoxedPrimitiveEquality
    
}
}