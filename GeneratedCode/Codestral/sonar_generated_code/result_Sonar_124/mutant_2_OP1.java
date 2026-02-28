import java.util.Random;

class MathOperationBug {

    public float computeFloat(int factor) {
        int deadStoreVariable; // Dead store mutant
        return (float) factor / 3;
    }

    public long computeLong(int factor) {
        Random random = new Random();
        int anotherDeadStoreVariable = random.nextInt(); // Another dead store mutant
        return (long) factor * 10_000;
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