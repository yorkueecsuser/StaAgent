class BoxedPrimitiveComparison {

    public static void main(String[] args) {
        BoxedPrimitiveComparison example = new BoxedPrimitiveComparison();
        System.out.println("Result of showBug: " + example.showBug(127, 127));
        System.out.println("Result of showBug: " + example.showBug(128, 128));
    }

    public boolean showBug(Integer a, Integer b) {
        // Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never print.");
                break;
            case 2:
                System.out.println("Nor will this.");
                break;
            default:
                System.out.println("Default case will not execute.");
                break;
        }
        
        return a == b; // BUG: BoxedPrimitiveEquality
    }

    private int getUnreachableValue() {
        return 0; // This method ensures the switch statement is unreachable
    }
}