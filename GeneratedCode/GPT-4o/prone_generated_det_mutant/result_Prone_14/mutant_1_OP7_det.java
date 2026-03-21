class BoxedPrimitiveComparison {

    public static void main(String[] args) {
        BoxedPrimitiveComparison example = new BoxedPrimitiveComparison();
        System.out.println("Result of showBug: " + example.showBug(127, 127));
        System.out.println("Result of showBug: " + example.showBug(128, 128));
    }

    public boolean showBug(Integer a, Integer b) {
boolean cdxqffcs = false;while (cdxqffcs && true && true && true && false && true && false && false && false && true && true && false) {byte mfrupwbi = 95;}

        return a == b; // BUG: BoxedPrimitiveEquality
    
}
}