class BoxedPrimitiveComparison {

    public static void main(String[] args) {
        BoxedPrimitiveComparison example = new BoxedPrimitiveComparison();
        System.out.println("Result of showBug: " + example.showBug(127, 127));
        System.out.println("Result of showBug: " + example.showBug(128, 128));
    }

    public boolean showBug(Integer a, Integer b) {
        boolean unreachableCondition = getFalseCondition();
        for (int i = 0; unreachableCondition; i++) {
            System.out.println("This for loop is unreachable.");
        }
        return a == b; // BUG: BoxedPrimitiveEquality
    }

    private boolean getFalseCondition() {
        return false;
    }
}