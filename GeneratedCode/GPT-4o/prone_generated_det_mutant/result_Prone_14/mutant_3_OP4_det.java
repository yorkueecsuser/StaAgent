class BoxedPrimitiveComparison {

    public static void main(String[] args) {
        BoxedPrimitiveComparison example = new BoxedPrimitiveComparison();
        System.out.println("Result of showBug: " + example.showBug(127, 127));
        System.out.println("Result of showBug: " + example.showBug(128, 128));
    }

    public boolean showBug(Integer a, Integer b) {
if (false && true && false && false && false && false && false && false && false && false && false) {String mfegpcrf = "zjqiivnc";}else{char pyjmfdhs = 'x';}

        return a == b; // BUG: BoxedPrimitiveEquality
    
}
}