class BoxedPrimitiveComparison {

    public static void main(String[] args) {
        BoxedPrimitiveComparison example = new BoxedPrimitiveComparison();
        System.out.println("Result of showBug: " + example.showBug(127, 127));
        System.out.println("Result of showBug: " + example.showBug(128, 128));
    }

    public boolean showBug(Integer a, Integer b) {
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            // This loop is unreachable because conditionWhile is always false
            System.out.println("This line will never be executed.");
        }
        
        return a == b; // BUG: BoxedPrimitiveEquality
    }
    
    private boolean getFalseCondition() {
        return false;
    }
}