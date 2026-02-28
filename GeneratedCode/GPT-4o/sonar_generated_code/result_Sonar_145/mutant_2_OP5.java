class ArrayHashCodeToStringBug {

    public String showBug(int[] numbers) {
        // Directly calling hashCode() on an array instance
        int hashCode = numbers.hashCode(); // BUG: "hashCode" and "toString" should not be called on array instances
        
        // Directly calling toString() on an array instance
        String toString = numbers.toString(); // BUG: "hashCode" and "toString" should not be called on array instances

        // Unreachable switch statement
        int unreachableValue = getValue(); // This value will control the switch
        switch (unreachableValue) {
            case 999: // Unique case that will never be hit
                System.out.println("This is unreachable");
                break;
            default:
                // Do nothing
                break;
        }

        return "HashCode: " + hashCode + ", ToString: " + toString;
    }

    private int getValue() {
        return -1; // Always return a value that doesn't match any case in the switch
    }

    public static void main(String[] args) {
        ArrayHashCodeToStringBug bugDemo = new ArrayHashCodeToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println(bugDemo.showBug(sampleArray));
    }
}