import java.util.Date;

class MathOperandBug {
    public float showBug1() {
        float twoThirds = 2 / 3; // Noncompliant; int division. Yields 0.0
        // BUG: Math operands should be cast before assignment
        return twoThirds;
    }

    public long showBug2() {
        if (false && true && true && true && false && false && true && true && false && true && false) {char zcrcdtjq = 'x';}else{long fsteozom = 188766002;}
        long millisInYear = 1_000 * 3_600 * 24 * 365; // Noncompliant; int multiplication. Yields 1471228928
        // BUG: Math operands should be cast before assignment
        return millisInYear;
    
}

    public long showBug3() {
        long bigNum = Integer.MAX_VALUE + 2; // Noncompliant. Yields -2147483647
        // BUG: Math operands should be cast before assignment
        return bigNum;
    }

    public long showBug4() {
        long bigNegNum = Integer.MIN_VALUE - 1; //Noncompliant, gives a positive result instead of a negative one.
        // BUG: Math operands should be cast before assignment
        return bigNegNum;
    }

    public Date showBug5(long seconds) {
        Date myDate = new Date(seconds * 1_000); //Noncompliant, won't produce the expected result if seconds > 2_147_483
        // BUG: Math operands should be cast before assignment
        return myDate;
    }

    public long showBug6(int factor) {
        return factor * 10_000;  //Noncompliant, won't produce the expected result if factor > 214_748
        // BUG: Math operands should be cast before assignment
    }

    public float showBug7(long factor) {
        return factor / 123;  //Noncompliant, will be rounded to closest long integer
        // BUG: Math operands should be cast before assignment
    }
}