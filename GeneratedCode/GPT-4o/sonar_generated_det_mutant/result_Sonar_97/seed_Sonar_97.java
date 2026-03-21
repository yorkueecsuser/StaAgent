import java.util.Random;

class AbsNegationBugDemo {

    public int showBug(int seed) {
        Random random = new Random(seed);
        int randomNumber = random.nextInt();
        return Math.abs(randomNumber); // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
    }

    public static void main(String[] args) {
        AbsNegationBugDemo demo = new AbsNegationBugDemo();
        System.out.println("Result: " + demo.showBug(12345));
    }
}