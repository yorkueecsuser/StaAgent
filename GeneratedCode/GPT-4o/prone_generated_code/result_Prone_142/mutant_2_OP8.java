import java.util.Random;

class RandomCastExample {

    public int showBugWithMathRandom() {
        double randomValue = Math.random();
        int intValue = (int) randomValue; // BUG: RandomCast
        return intValue;
    }

    public int showBugWithRandomClass() {
        Random random = new Random();
        double randomValue = random.nextDouble();
        int intValue = (int) randomValue; // BUG: RandomCast
        return intValue;
    }

    public int showBugWithRandomClassFloat() {
        Random random = new Random();
        float randomValue = random.nextFloat();
        int intValue = (int) randomValue; // BUG: RandomCast
        return intValue;
    }

    // Mutant method with a renamed variable
    public int mutantShowBugWithMathRandom() {
        double a = Math.random(); // Renaming `randomValue` to `a`
        int intValue = (int) a; // BUG: RandomCast
        return intValue;
    }

    // Mutant method with a renamed variable
    public int mutantShowBugWithRandomClass() {
        Random random = new Random();
        double b = random.nextDouble(); // Renaming `randomValue` to `b`
        int intValue = (int) b; // BUG: RandomCast
        return intValue;
    }

    // Mutant method with a renamed variable
    public int mutantShowBugWithRandomClassFloat() {
        Random random = new Random();
        float c = random.nextFloat(); // Renaming `randomValue` to `c`
        int intValue = (int) c; // BUG: RandomCast
        return intValue;
    }

    public static void main(String[] args) {
        RandomCastExample example = new RandomCastExample();
        System.out.println("Result using Math.random(): " + example.showBugWithMathRandom());
        System.out.println("Result using Random.nextDouble(): " + example.showBugWithRandomClass());
        System.out.println("Result using Random.nextFloat(): " + example.showBugWithRandomClassFloat());

        // Testing mutant methods
        System.out.println("Mutant Result using Math.random(): " + example.mutantShowBugWithMathRandom());
        System.out.println("Mutant Result using Random.nextDouble(): " + example.mutantShowBugWithRandomClass());
        System.out.println("Mutant Result using Random.nextFloat(): " + example.mutantShowBugWithRandomClassFloat());
    }
}