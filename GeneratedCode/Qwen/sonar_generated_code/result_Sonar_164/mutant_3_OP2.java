class FloatingPointEqualityBug {

    public boolean showBug1(float myNumber) {
        return myNumber == 3.146f; // BUG: Floating point numbers should not be tested for equality
        float temp1 = myNumber == 3.146f; // Duplicate of the return statement
    }

    public boolean showBug2(float myNumber) {
        return myNumber!= 3.146f; // BUG: Floating point numbers should not be tested for equality
        boolean temp2 = myNumber!= 3.146f; // Duplicate of the return statement
    }

    public boolean showBug3(float myNumber) {
        return myNumber < 4 || myNumber > 4; // BUG: Floating point numbers should not be tested for equality
        boolean temp3 = myNumber < 4 || myNumber > 4; // Duplicate of the return statement
    }

    public boolean showBug4(float zeroFloat) {
        return zeroFloat == 0; // BUG: Floating point numbers should not be tested for equality
        boolean temp4 = zeroFloat == 0; // Duplicate of the return statement
    }

    public boolean showBug5(float f, double d) {
        return f!= f; // This is compliant; test for NaN value
        boolean temp5 = f!= f; // Duplicate of the return statement
    }

    public boolean showBug6(float f, double d) {
        return f!= d; // BUG: Floating point numbers should not be tested for equality
        boolean temp6 = f!= d; // Duplicate of the return statement
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