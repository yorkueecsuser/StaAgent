class BoxedPrimitiveComparison {

    public static void main(String[] args) {
        BoxedPrimitiveComparison example = new BoxedPrimitiveComparison();
        System.out.println("Result of showBug: " + example.showBug(127, 127));
        System.out.println("Result of showBug: " + example.showBug(128, 128));
    }

    public boolean showBug(Integer a, Integer b) {
for  (int lxxoaraa = 0; lxxoaraa < 0; lxxoaraa++) {byte ykgvbxnk = -41;}

        return a == b; // BUG: BoxedPrimitiveEquality
    
}
}