class FloatingPointEqualityBug {

    public boolean showBug1(float myNumber) {
        boolean condition = getCondition();
        if (condition) { // Unreachable if statement
            System.out.println("This is an unreachable statement");
        }
        return myNumber == 3.146f; // BUG: Floating point numbers should not be tested for equality
    }

    public boolean showBug2(float myNumber) {
        boolean condition = getCondition();
        if (condition) { // Unreachable if statement
            System.out.println("This is an unreachable statement");
        }
        return myNumber!= 3.146f; // BUG: Floating point numbers should not be tested for equality
    }

    public boolean showBug3(float myNumber) {
        boolean condition = getCondition();
        if (condition) { // Unreachable if statement
            System.out.println("This is an unreachable statement");
        }
        return myNumber < 4 || myNumber > 4; // BUG: Floating point numbers should not be tested for equality
    }

    public boolean showBug4(float zeroFloat) {
        boolean condition = getCondition();
        if (condition) { // Unreachable if statement
            System.out.println("This is an unreachable statement");
        }
        return zeroFloat == 0; // BUG: Floating point numbers should not be tested for equality
    }

    public boolean showBug5(float f, double d) {
        boolean condition = getCondition();
        if (condition) { // Unreachable if statement
            System.out.println("This is an unreachable statement");
        }
        return f!= f; // This is compliant; test for NaN value
    }

    public boolean showBug6(float f, double d) {
        boolean condition = getCondition();
        if (condition) { // Unreachable if statement
            System.out.println("This is an unreachable statement");
        }
        return f!= d; // BUG: Floating point numbers should not be tested for equality
    }

    private boolean getCondition() {
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