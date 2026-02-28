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

    // Mutant: Renaming variable 'randomValue' to 'y' in the method showBugWithMathRandom
    public int showBugWithMathRandomMutant() {
        double y = Math.random();
        int intValue = (int) y;
        return intValue;
    }

    // Mutant: Renaming variable 'randomValue' to 'z' in the method showBugWithRandomClass
    public int showBugWithRandomClassMutant() {
        Random random = new Random();
        double z = random.nextDouble();
        int intValue = (int) z;
        return intValue;
    }

    // Mutant: Renaming variable 'randomValue' to 'x' in the method showBugWithRandomClassFloat
    public int showBugWithRandomClassFloatMutant() {
        Random random = new Random();
        float x = random.nextFloat();
        int intValue = (int) x;
        return intValue;
    }

    public static void main(String[] args) {
        RandomCastExample example = new RandomCastExample();
        System.out.println("Result using Math.random(): " + example.showBugWithMathRandom());
        System.out.println("Result using Math.random() Mutant: " + example.showBugWithMathRandomMutant());
        System.out.println("Result using Random.nextDouble(): " + example.showBugWithRandomClass());
        System.out.println("Result using Random.nextDouble() Mutant: " + example.showBugWithRandomClassMutant());
        System.out.println("Result using Random.nextFloat(): " + example.showBugWithRandomClassFloat());
        System.out.println("Result using Random.nextFloat() Mutant: " + example.showBugWithRandomClassFloatMutant());
    }
}