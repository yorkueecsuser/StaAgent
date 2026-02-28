class FloatingPointEqualityDemo {

    private int getUnreachableCondition() {
        // This method will always return a value that does not match any case in the switch statement
        return -1;
    }

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

        // Unreachable switch statement inserted as a mutation
        int unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition) {
            case 1:
                // Unreachable code
                System.out.println("Unreachable case 1");
                break;
            case 2:
                // Unreachable code
                System.out.println("Unreachable case 2");
                break;
            default:
                // Default is also unreachable due to the unreachable condition
                System.out.println("Unreachable default case");
                break;
        }

        return result;
    }

    public static void main(String[] args) {
        FloatingPointEqualityDemo demo = new FloatingPointEqualityDemo();
        boolean bugResult = demo.showBug(3.146f, 0.0f);
        System.out.println("Bug demonstrated: " + bugResult);
    }
}