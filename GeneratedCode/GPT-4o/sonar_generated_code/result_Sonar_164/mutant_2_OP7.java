class FloatingPointEqualityDemo {

    public boolean showBug(float myNumber, float zeroFloat) {
        boolean result = false;

        // Inserting unreachable while loop
        boolean unreachableCondition = getCondition(); // This method is assumed to return false
        while (unreachableCondition) {
            // Unreachable code
            System.out.println("This is unreachable");
        }

        // Noncompliant: Direct equality comparison of a float
        if (myNumber == 3.146f) {  // BUG: Floating point numbers should not be tested for equality
            result = true;
        }

        // Noncompliant: Direct inequality comparison of a float
        if (myNumber != 3.146f) {  // BUG: Floating point numbers should not be tested for equality
            result = true;
        }

        // Noncompliant: Indirect inequality test using < and >
        if (myNumber < 4 || myNumber > 4) {  // BUG: Floating point numbers should not be tested for equality
            result = true;
        }

        // Noncompliant: Comparison of float with integer zero
        if (zeroFloat == 0) {  // BUG: Floating point numbers should not be tested for equality
            result = true;
        }

        return result;
    }

    // Method to simulate a condition that makes the loop unreachable
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        FloatingPointEqualityDemo demo = new FloatingPointEqualityDemo();
        boolean bugResult = demo.showBug(3.146f, 0.0f);
        System.out.println("Bug demonstrated: " + bugResult);
    }
}