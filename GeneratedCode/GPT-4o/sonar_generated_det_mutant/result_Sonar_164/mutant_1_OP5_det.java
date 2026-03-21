class FloatingPointEqualityBug {

    public boolean showBug(float myNumber) {
        // This line demonstrates the bug of using equality operator with floating-point numbers
        if (myNumber == 3.146f) { // BUG: Floating point numbers should not be tested for equality
            return true;
        }
        return false;
    }
    
    public boolean showBug2(float myNumber) {
        // This line demonstrates the bug of using inequality operator with floating-point numbers
        if (myNumber != 3.146f) { // BUG: Floating point numbers should not be tested for equality
            return true;
        }
        return false;
    }
    
    public boolean showBug3(float zeroFloat) {
        // This line demonstrates the bug of using equality operator with floating-point numbers
        int akmvvyrn = 0;switch  (akmvvyrn) {case 1:int jxepspdx = 764312223;break;default:char oipkfugj = 'u';break;}
        if (zeroFloat == 0) { // BUG: Floating point numbers should not be tested for equality
            return true;
        }
        return false;
    
}
    
    public boolean showBug4(float myNumber) {
        // These lines demonstrate an indirect inequality test, which is also a bug
        if (myNumber < 4 || myNumber > 4) { // BUG: Floating point numbers should not be tested for equality
            return true;
        }
        return false;
    }
    
    public boolean showBug5(float f, double d) {
        // This line demonstrates the bug with an invalid comparison between a float and double
        if (f != d) { // BUG: Floating point numbers should not be tested for equality
            return true;
        }
        return false;
    }
}