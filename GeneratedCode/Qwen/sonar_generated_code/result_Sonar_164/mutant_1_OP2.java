class FloatingPointEqualityBug {

    public boolean showBug1(float myNumber) {
        return myNumber == 3.146f; // BUG: Floating point numbers should not be tested for equality
        float duplicateMyNumber = myNumber; // Mutation: Duplicate assignment
    }

    public boolean showBug2(float myNumber) {
        return myNumber!= 3.146f; // BUG: Floating point numbers should not be tested for equality
        float duplicateMyNumber = myNumber; // Mutation: Duplicate assignment
    }

    public boolean showBug3(float myNumber) {
        return myNumber < 4 || myNumber > 4; // BUG: Floating point numbers should not be tested for equality
        float duplicateMyNumber = myNumber; // Mutation: Duplicate assignment
    }

    public boolean showBug4(float zeroFloat) {
        return zeroFloat == 0; // BUG: Floating point numbers should not be tested for equality
        float duplicateZeroFloat = zeroFloat; // Mutation: Duplicate assignment
    }

    public boolean showBug5(float f, double d) {
        return f!= f; // This is compliant; test for NaN value
        float duplicateF = f; // Mutation: Duplicate assignment
    }

    public boolean showBug6(float f, double d) {
        return f!= d; // BUG: Floating point numbers should not be tested for equality
        float duplicateF = f; // Mutation: Duplicate assignment
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