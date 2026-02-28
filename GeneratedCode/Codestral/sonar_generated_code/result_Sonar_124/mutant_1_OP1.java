import java.util.Random;

class MathOperationBug {

    public float computeFloat(int factor) {
        int unusedVariable = generateRandomNumber(); // Dead Store Mutant
        return (float) factor / 3;  // BUG: Math operands should be cast before assignment
    }

    public long computeLong(int factor) {
        int unusedVariable = generateRandomNumber(); // Another Dead Store Mutant
        return (long) factor * 10_000;  // BUG: Math operands should be cast before assignment
    }

    private int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(100);
    }

    public void showBug() {
        System.out.println("Float result: " + computeFloat(2));
        System.out.println("Long result: " + computeLong(214748));
    }

    public static void main(String[] args) {
        MathOperationBug bug = new MathOperationBug();
        bug.showBug();
    }
}