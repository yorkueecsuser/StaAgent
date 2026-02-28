class BoxedPrimitiveComparison {

    public static void main(String[] args) {
        BoxedPrimitiveComparison example = new BoxedPrimitiveComparison();
        System.out.println("Result of showBug: " + example.showBug(127, 127));
        System.out.println("Result of showBug: " + example.showBug(128, 128));
    }

    public boolean showBug(Integer a, Integer b) {
        // Original code
        boolean result = a == b; // BUG: BoxedPrimitiveEquality

        // Adding an unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch(unreachableValue) {
            case 999: // This case will never be reached
                System.out.println("This is unreachable.");
                break;
            default:
                break;
        }
        
        return result;
    }
    
    // Method to provide a switch condition value that makes the switch statement unreachable
    public int getUnreachableValue() {
        return 1000; // This value is chosen such that it doesn't match any case in the switch
    }
}