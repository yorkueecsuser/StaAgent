class CustomPoint {
    private int x;
    private int y;

    public CustomPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Incorrect equals method that does not override Object's equals(Object)
    public boolean equals(CustomPoint other) { // BUG: "equals" method overrides should accept "Object" parameters
        if (this.x == other.x && this.y == other.y) {
            return true;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * x + y;
    }

    public boolean showBug(CustomPoint other) {
        return this.equals(other); // Demonstrates the bug in usage
    }

    public static void main(String[] args) {
        CustomPoint point1 = new CustomPoint(1, 2);
        CustomPoint point2 = new CustomPoint(1, 2);
        CustomPoint point3 = new CustomPoint(2, 3);

        System.out.println("Point1 equals Point2: " + point1.showBug(point2)); // true
        System.out.println("Point1 equals Point3: " + point1.showBug(point3)); // false

        // This won't cause a compile error, but doesn't override Object's equals(Object)
        Object obj = point2;
        System.out.println("Point1 equals Object: " + point1.equals(obj)); // false, even if logically true

        // Introduce an unreachable switch statement
        int unreachableValue = getUnreachableValue(); // Ensure this value will not match any case
        switch (unreachableValue) {
            case 999: // This block will never be executed
                System.out.println("Unreachable case executed.");
                break;
            default:
                // Default block, which can be reached, but intentionally left empty
                break;
        }
    }

    // Method to provide a non-final value ensuring the switch statement is unreachable
    private static int getUnreachableValue() {
        return -1; // Choose a value that doesn't match any case in the switch
    }
}