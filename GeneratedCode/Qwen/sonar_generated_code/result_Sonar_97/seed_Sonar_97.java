import java.util.Random;

class MathAbsBugDemo {

    public int showBug(String str) {
        return Math.abs(str.hashCode()); // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
    }

    public int showBug1(int number) {
        return Math.abs(number); // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
    }

    public long showBug2(long number) {
        return Math.abs(number); // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
    }

    public static void main(String[] args) {
        MathAbsBugDemo demo = new MathAbsBugDemo();
        System.out.println(demo.showBug("test"));
        System.out.println(demo.showBug1(Integer.MIN_VALUE));
        System.out.println(demo.showBug2(Long.MIN_VALUE));
    }
}