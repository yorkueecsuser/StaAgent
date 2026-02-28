class FloatingPointEqualityBug {

    public boolean showBug1(float myNumber) {
        return myNumber == 3.146f; // BUG: Floating point numbers should not be tested for equality
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            System.out.println("This is an unreachable if block in showBug1");
        } else {
            // Unreachable code
            System.out.println("This is an unreachable else block in showBug1");
        }
    }

    public boolean showBug2(float myNumber) {
        return myNumber!= 3.146f; // BUG: Floating point numbers should not be tested for equality
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            System.out.println("This is an unreachable if block in showBug2");
        } else {
            // Unreachable code
            System.out.println("This is an unreachable else block in showBug2");
        }
    }

    public boolean showBug3(float myNumber) {
        return myNumber < 4 || myNumber > 4; // BUG: Floating point numbers should not be tested for equality
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            System.out.println("This is an unreachable if block in showBug3");
        } else {
            // Unreachable code
            System.out.println("This is an unreachable else block in showBug3");
        }
    }

    public boolean showBug4(float zeroFloat) {
        return zeroFloat == 0; // BUG: Floating point numbers should not be tested for equality
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            System.out.println("This is an unreachable if block in showBug4");
        } else {
            // Unreachable code
            System.out.println("This is an unreachable else block in showBug4");
        }
    }

    public boolean showBug5(float f, double d) {
        return f!= f; // This is compliant; test for NaN value
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            System.out.println("This is an unreachable if block in showBug5");
        } else {
            // Unreachable code
            System.out.println("This is an unreachable else block in showBug5");
        }
    }

    public boolean showBug6(float f, double d) {
        return f!= d; // BUG: Floating point numbers should not be tested for equality
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            System.out.println("This is an unreachable if block in showBug6");
        } else {
            // Unreachable code
            System.out.println("This is an unreachable else block in showBug6");
        }
    }

    private boolean getCondition() {
        // This method returns a condition that is always false, but it is not a compile-time constant
        return false;
    }

    public static void main(String[] args) {
        FloatingPointEqualityBug bugDemo = new FloatingPointEqualityBug();
        System.out.println(bugDemo.showBug1(3.146f));
        System.out.println(bugDemo.showBug2(3.146f));
        System.out.println(bugDemo.showBug3(3.146f));
        System.out.println(bugDemo.showBug4(0.0f));
        System.out.println(bugDemo.showBug5(Float.NaN, 0.0));
        System.out.println(bugDemo.showBug6(Float.NaN, 0.0));
    }
}