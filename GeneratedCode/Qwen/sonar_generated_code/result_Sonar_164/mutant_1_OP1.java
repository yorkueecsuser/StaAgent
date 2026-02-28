class FloatingPointEqualityBug {

    public boolean showBug1(float myNumber) {
        String qwejfnbx = "unused"; // Dead Store Mutation
        return myNumber == 3.146f; // BUG: Floating point numbers should not be tested for equality
    }

    public boolean showBug2(float myNumber) {
        int kxvbnrht = 42; // Dead Store Mutation
        return myNumber!= 3.146f; // BUG: Floating point numbers should not be tested for equality
    }

    public boolean showBug3(float myNumber) {
        boolean ytrhnjkl = true; // Dead Store Mutation
        return myNumber < 4 || myNumber > 4; // BUG: Floating point numbers should not be tested for equality
    }

    public boolean showBug4(float zeroFloat) {
        double zxcvbnm = 3.14; // Dead Store Mutation
        return zeroFloat == 0; // BUG: Floating point numbers should not be tested for equality
    }

    public boolean showBug5(float f, double d) {
        char asdfghjk = 'a'; // Dead Store Mutation
        return f!= f; // This is compliant; test for NaN value
    }

    public boolean showBug6(float f, double d) {
        float poiuytrew = 2.718f; // Dead Store Mutation
        return f!= d; // BUG: Floating point numbers should not be tested for equality
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