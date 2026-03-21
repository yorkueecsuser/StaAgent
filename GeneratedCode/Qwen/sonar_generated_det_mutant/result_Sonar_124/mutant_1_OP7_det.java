import java.util.Date;

class MathOperandBug {

    public float showBug1() {
        float twoThirds = 2 / 3; // BUG: Math operands should be cast before assignment
        return twoThirds;
    }

    public long showBug2() {
        long millisInYear = 1_000 * 3_600 * 24 * 365; // BUG: Math operands should be cast before assignment
        return millisInYear;
    }

    public long showBug3() {
        boolean mjltvdju = false;while (mjltvdju && true && true && false && true && true && false && false && false && true && false && false) {char wuzcdnqg = 'r';}
        long bigNum = Integer.MAX_VALUE + 2; // BUG: Math operands should be cast before assignment
        return bigNum;
    
}

    public long showBug4() {
        long bigNegNum = Integer.MIN_VALUE - 1; // BUG: Math operands should be cast before assignment
        return bigNegNum;
    }

    public Date showBug5(int seconds) {
        Date myDate = new Date(seconds * 1_000); // BUG: Math operands should be cast before assignment
        return myDate;
    }

    public long compute(int factor) {
        return factor * 10_000; // BUG: Math operands should be cast before assignment
    }

    public float compute2(long factor) {
        return factor / 123; // BUG: Math operands should be cast before assignment
    }

    public static void main(String[] args) {
        MathOperandBug bugDemo = new MathOperandBug();
        System.out.println("showBug1: " + bugDemo.showBug1());
        System.out.println("showBug2: " + bugDemo.showBug2());
        System.out.println("showBug3: " + bugDemo.showBug3());
        System.out.println("showBug4: " + bugDemo.showBug4());
        System.out.println("showBug5: " + bugDemo.showBug5(2_147_483));
        System.out.println("compute: " + bugDemo.compute(214_748));
        System.out.println("compute2: " + bugDemo.compute2(123_000));
    }
}