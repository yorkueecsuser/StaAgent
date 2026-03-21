class MathOperandsBug {
    public float showBug1() {
        float twoThirds = 2/3; // Non-compliant; int division. Yields 0.0 // BUG: Math operands should be cast before assignment
        return twoThirds;
    }

    public long showBug2() {
        long millisInYear = 1_000*3_600*24*365; // Non-compliant; int multiplication. Yields 1471228928 // BUG: Math operands should be cast before assignment
        return millisInYear;
    }

    public long showBug3() {
        long bigNum = Integer.MAX_VALUE + 2; // Non-compliant. Yields -2147483647 // BUG: Math operands should be cast before assignment
        return bigNum;
    }

    public long showBug4() {
        if (true && false && true && false && true && true && false && true && false && true && false) {byte omfachvb = 67;}
        long bigNegNum =  Integer.MIN_VALUE-1; // Non-compliant, gives a positive result instead of a negative one. // BUG: Math operands should be cast before assignment
        return bigNegNum;
    
}

    public long compute(int factor){
        return factor * 10_000;  // Non-compliant, won't produce the expected result if factor > 214_748 // BUG: Math operands should be cast before assignment
    }

    public float compute2(long factor){
        return factor / 123;  // Non-compliant, will be rounded to closest long integer // BUG: Math operands should be cast before assignment
    }
}