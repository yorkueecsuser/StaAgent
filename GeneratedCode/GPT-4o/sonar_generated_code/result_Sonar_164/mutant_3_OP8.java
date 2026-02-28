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

        return result;
    }

    // Mutant code begins here
    public boolean showBug(float x, float y) {
        boolean r = false;

        // Noncompliant: Direct equality comparison of a float
        if (x == 3.146f) {  // BUG: Floating point numbers should not be tested for equality
            r = true;
        }

        // Noncompliant: Direct inequality comparison of a float
        if (x != 3.146f) {  // BUG: Floating point numbers should not be tested for equality
            r = true;
        }

        // Noncompliant: Indirect inequality test using < and >
        if (x < 4 || x > 4) {  // BUG: Floating point numbers should not be tested for equality
            r = true;
        }

        // Noncompliant: Comparison of float with integer zero
        if (y == 0) {  // BUG: Floating point numbers should not be tested for equality
            r = true;
        }

        return r;
    }
    // Mutant code ends here

    public static void main(String[] args) {
        FloatingPointEqualityDemo demo = new FloatingPointEqualityDemo();
        boolean bugResult = demo.showBug(3.146f, 0.0f);
        System.out.println("Bug demonstrated: " + bugResult);
    }
}