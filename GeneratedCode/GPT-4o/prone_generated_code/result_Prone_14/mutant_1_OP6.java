class BoxedPrimitiveComparison {

    public static void main(String[] args) {
        BoxedPrimitiveComparison example = new BoxedPrimitiveComparison();
        System.out.println("Result of showBug: " + example.showBug(127, 127));
        System.out.println("Result of showBug: " + example.showBug(128, 128));
    }

    public boolean showBug(Integer a, Integer b) {
        // Unreachable for loop added as per the mutation operator description
        boolean unreachableCondition = getFalseCondition();
        for (int i = 0; unreachableCondition; i++) {
            System.out.println("This code is unreachable.");
        }

        return a == b; // BUG: BoxedPrimitiveEquality
    }

    // This method ensures the condition is dynamically determined at runtime
    private boolean getFalseCondition() {
        return false;
    }
}