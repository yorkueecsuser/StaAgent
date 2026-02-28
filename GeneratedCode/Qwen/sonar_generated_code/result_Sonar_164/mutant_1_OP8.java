class FloatingPointEqualityBug {

    public boolean showBug1(float myNumber) {
        float a = myNumber;
        return a == 3.146f; // BUG: Floating point numbers should not be tested for equality
    }

    public boolean showBug2(float myNumber) {
        float b = myNumber;
        return b!= 3.146f; // BUG: Floating point numbers should not be tested for equality
    }

    public boolean showBug3(float myNumber) {
        float c = myNumber;
        return c < 4 || c > 4; // BUG: Floating point numbers should not be tested for equality
    }

    public boolean showBug4(float zeroFloat) {
        float d = zeroFloat;
        return d == 0; // BUG: Floating point numbers should not be tested for equality
    }

    public boolean showBug5(float f, double d) {
        float e = f;
        return e!= e; // This is compliant; test for NaN value
    }

    public boolean showBug6(float f, double d) {
        float g = f;
        return g!= d; // BUG: Floating point numbers should not be tested for equality
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