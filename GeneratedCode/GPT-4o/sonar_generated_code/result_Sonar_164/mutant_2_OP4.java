class FloatingPointEqualityDemo {

    public boolean showBug(float myNumber, float zeroFloat) {
        boolean result = false;

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

        // Inserting an unreachable if-else branch
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This branch will never be reached.");
        } else {
            System.out.println("This branch will always be executed.");
        }

        return result;
    }

    private boolean getUnreachableCondition() {
        return false;  // This simulates a condition that is always false
    }

    public static void main(String[] args) {
        FloatingPointEqualityDemo demo = new FloatingPointEqualityDemo();
        boolean bugResult = demo.showBug(3.146f, 0.0f);
        System.out.println("Bug demonstrated: " + bugResult);
    }
}