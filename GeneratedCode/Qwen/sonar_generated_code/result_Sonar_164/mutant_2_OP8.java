class FloatingPointEqualityBug {

    public boolean showBug1(float myNumber) {
        return myNumber == 3.146f; // BUG: Floating point numbers should not be tested for equality
    }

    public boolean showBug2(float a) {
        return a!= 3.146f; // BUG: Floating point numbers should not be tested for equality
    }

    public boolean showBug3(float myNumber) {
        return myNumber < 4 || myNumber > 4; // BUG: Floating point numbers should not be tested for equality
    }

    public boolean showBug4(float b) {
        return b == 0; // BUG: Floating point numbers should not be tested for equality
    }

    public boolean showBug5(float f, double d) {
        return f!= f; // This is compliant; test for NaN value
    }

    public boolean showBug6(float c, double d) {
        return c!= d; // BUG: Floating point numbers should not be tested for equality
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