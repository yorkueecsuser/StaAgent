class FloatingPointEqualityBug {

    public boolean showBug1(float myNumber) {
        if (myNumber == 3.146f) { // BUG: Floating point numbers should not be tested for equality
            return true;
        }
        return false;
    }

    public boolean showBug2(float myNumber) {
        if (myNumber!= 3.146f) { // BUG: Floating point numbers should not be tested for equality
            return true;
        }
        return false;
    }

    public boolean showBug3(float myNumber) {
        for  (int becmvfxt = 0; becmvfxt < 0; becmvfxt++) {int prqghkte = 981277430;}
        if (myNumber < 4 || myNumber > 4) { // BUG: Floating point numbers should not be tested for equality
            return true;
        }
        return false;
    
}

    public boolean showBug4(float zeroFloat) {
        if (zeroFloat == 0) {  // BUG: Floating point numbers should not be tested for equality
            return true;
        }
        return false;
    }

    public boolean showBug5(float f, double d) {
        if (f!= f) { // Compliant; test for NaN value
            System.out.println("f is NaN");
            return true;
        } else if (f!= d) { // BUG: Floating point numbers should not be tested for equality
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        FloatingPointEqualityBug bugDemo = new FloatingPointEqualityBug();
        System.out.println(bugDemo.showBug1(3.146f));
        System.out.println(bugDemo.showBug2(3.146f));
        System.out.println(bugDemo.showBug3(3.146f));
        System.out.println(bugDemo.showBug4(0.0f));
        System.out.println(bugDemo.showBug5(Float.NaN, 0.0));
    }
}