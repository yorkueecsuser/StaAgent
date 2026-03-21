class BoxedPrimitiveComparison {

    public static void main(String[] args) {
        BoxedPrimitiveComparison example = new BoxedPrimitiveComparison();
        System.out.println("Result of showBug: " + example.showBug(127, 127));
        System.out.println("Result of showBug: " + example.showBug(128, 128));
    }

    public boolean showBug(Integer a, Integer b) {
if (false && false && true && true && false && true && true && false && false && true && false) {byte xaqwimut = 36;}else{short fgxvahrc = -303;}

        return a == b; // BUG: BoxedPrimitiveEquality
    
}
}