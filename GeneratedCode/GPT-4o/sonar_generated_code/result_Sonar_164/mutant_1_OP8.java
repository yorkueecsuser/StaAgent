class FloatingPointEqualityDemo {

    public boolean showBug(float myNumber, float zeroFloat) {
        boolean result = false;
        
        // Original Code
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
    
    // Mutant Code
    public boolean showBug(float a, float b) {
        boolean c = false;
        
        // Noncompliant: Direct equality comparison of a float
        if (a == 3.146f) {  // BUG: Floating point numbers should not be tested for equality
            c = true;
        }

        // Noncompliant: Direct inequality comparison of a float
        if (a != 3.146f) {  // BUG: Floating point numbers should not be tested for equality
            c = true;
        }

        // Noncompliant: Indirect inequality test using < and >
        if (a < 4 || a > 4) {  // BUG: Floating point numbers should not be tested for equality
            c = true;
        }

        // Noncompliant: Comparison of float with integer zero
        if (b == 0) {  // BUG: Floating point numbers should not be tested for equality
            c = true;
        }

        return c;
    }

    public static void main(String[] args) {
        FloatingPointEqualityDemo demo = new FloatingPointEqualityDemo();
        boolean bugResult = demo.showBug(3.146f, 0.0f);
        System.out.println("Bug demonstrated: " + bugResult);
        
        // Mutant demonstration
        boolean mutantBugResult = demo.showBug(3.146f, 0.0f);
        System.out.println("Mutant Bug demonstrated: " + mutantBugResult);
    }
}