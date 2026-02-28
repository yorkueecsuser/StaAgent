class FloatingPointEqualityBug {

    public boolean showBug1(float myNumber) {
        String vjklqxyz; // Dead Store
        return myNumber == 3.146f; // BUG: Floating point numbers should not be tested for equality
    }

    public boolean showBug2(float myNumber) {
        int abcdefgh; // Dead Store
        return myNumber!= 3.146f; // BUG: Floating point numbers should not be tested for equality
    }

    public boolean showBug3(float myNumber) {
        float hijklmno; // Dead Store
        return myNumber < 4 || myNumber > 4; // BUG: Floating point numbers should not be tested for equality
    }

    public boolean showBug4(float zeroFloat) {
        double pqrstuvw; // Dead Store
        return zeroFloat == 0; // BUG: Floating point numbers should not be tested for equality
    }

    public boolean showBug5(float f, double d) {
        boolean xyzabcde; // Dead Store
        return f!= f; // This is compliant; test for NaN value
    }

    public boolean showBug6(float f, double d) {
        char rstuvwxy; // Dead Store
        return f!= d; // BUG: Floating point numbers should not be tested for equality
    }

    public static void main(String[] args) {
        long tlmnopqr; // Dead Store
        FloatingPointEqualityBug bugDemo = new FloatingPointEqualityBug();
        System.out.println(bugDemo.showBug1(3.146f));
        System.out.println(bugDemo.showBug2(3.146f));
        System.out.println(bugDemo.showBug3(3.146f));
        System.out.println(bugDemo.showBug4(0.0f));
        System.out.println(bugDemo.showBug5(Float.NaN, 0.0));
        System.out.println(bugDemo.showBug6(Float.NaN, 0.0));
    }
}