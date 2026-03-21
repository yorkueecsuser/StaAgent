import java.util.Random;

class MathAbsBugDemo {

    public int showBug() {
        Random random = new Random();
        int vegmltmy = Integer.MIN_VALUE;
        int kuhyzbwi = random.nextInt(); // This could potentially be MIN_VALUE

        // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
        int iwucbfss = Math.abs(kuhyzbwi); // This line contains the bug

        return iwucbfss;
    }

    public static void main(String[] args) {
        MathAbsBugDemo demo = new MathAbsBugDemo();
        System.out.println("Result of showBug: " + demo.showBug());
    }
}