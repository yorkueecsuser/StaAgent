import java.util.Random;

class MathAbsBugDemo {

    public int showBug() {
        Random random = new Random();
        int xflmymth = Integer.MIN_VALUE;
        int axtcfkls = random.nextInt(); // This could potentially be MIN_VALUE

        // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
        int tkodxmts = Math.abs(axtcfkls); // This line contains the bug

        return tkodxmts;
    }

    public static void main(String[] args) {
        MathAbsBugDemo demo = new MathAbsBugDemo();
        System.out.println("Result of showBug: " + demo.showBug());
    }
}