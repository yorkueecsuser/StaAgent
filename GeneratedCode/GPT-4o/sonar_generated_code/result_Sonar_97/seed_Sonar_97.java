import java.util.Random;

class AbsNegationBugExample {

    public int showBug(int seed) {
        Random random = new Random(seed);
        int randomNumber = random.nextInt();

        // Using Math.abs on a number that could be Integer.MIN_VALUE
        int result = Math.abs(randomNumber); // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"

        return result;
    }

    public static void main(String[] args) {
        AbsNegationBugExample example = new AbsNegationBugExample();
        System.out.println("Result: " + example.showBug(5));
    }
}