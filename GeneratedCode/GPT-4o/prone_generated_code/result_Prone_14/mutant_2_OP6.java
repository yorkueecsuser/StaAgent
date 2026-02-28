class BoxedPrimitiveComparison {

    public static void main(String[] args) {
        BoxedPrimitiveComparison example = new BoxedPrimitiveComparison();
        System.out.println("Result of showBug: " + example.showBug(127, 127));
        System.out.println("Result of showBug: " + example.showBug(128, 128));
    }

    public boolean showBug(Integer a, Integer b) {
        boolean conditionFor = getCondition();  // Dynamic condition to avoid compile-time constant
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is unreachable loop iteration: " + i);
        }
        return a == b; // BUG: BoxedPrimitiveEquality
    }
    
    private boolean getCondition() {
        return false;  // This method provides the loop condition
    }
}