class BoxedPrimitiveComparison {

    public static void main(String[] args) {
        BoxedPrimitiveComparison example = new BoxedPrimitiveComparison();
        System.out.println("Result of showBug: " + example.showBug(127, 127));
        System.out.println("Result of showBug: " + example.showBug(128, 128));
    }

    public boolean showBug(Integer a, Integer b) {
        // Unreachable switch statement mutation
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This is unreachable.");
                break;
            case 2:
                System.out.println("Still unreachable.");
                break;
            default:
                // default case, also unreachable
                break;
        }
        return a == b; // BUG: BoxedPrimitiveEquality
    }

    // Method to ensure runtime evaluation and avoid unreachable code error
    private int getUnreachableValue() {
        return 0; // This value makes the switch statement unreachable
    }
}