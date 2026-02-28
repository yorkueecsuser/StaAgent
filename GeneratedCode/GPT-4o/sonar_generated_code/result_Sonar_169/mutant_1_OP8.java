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
    }
}

// Mutant: Renaming the variable 'x' to 'a' in the constructor and hashCode method
class CustomPointMutant {
    private int a; // x renamed to a
    private int y;

    public CustomPointMutant(int a, int y) { // x renamed to a
        this.a = a; // x renamed to a
        this.y = y;
    }

    // Incorrect equals method that does not override Object's equals(Object)
    public boolean equals(CustomPointMutant other) { // BUG: "equals" method overrides should accept "Object" parameters
        if (this.a == other.a && this.y == other.y) { // x renamed to a
            return true;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * a + y; // x renamed to a
    }

    public boolean showBug(CustomPointMutant other) {
        return this.equals(other); // Demonstrates the bug in usage
    }

    public static void main(String[] args) {
        CustomPointMutant point1 = new CustomPointMutant(1, 2);
        CustomPointMutant point2 = new CustomPointMutant(1, 2);
        CustomPointMutant point3 = new CustomPointMutant(2, 3);

        System.out.println("Point1 equals Point2: " + point1.showBug(point2)); // true
        System.out.println("Point1 equals Point3: " + point1.showBug(point3)); // false

        // This won't cause a compile error, but doesn't override Object's equals(Object)
        Object obj = point2;
        System.out.println("Point1 equals Object: " + point1.equals(obj)); // false, even if logically true
    }
}