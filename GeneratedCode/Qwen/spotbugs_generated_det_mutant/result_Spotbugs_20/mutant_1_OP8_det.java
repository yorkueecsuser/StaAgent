import java.util.Random;

class RandomValueBug {

    public int showBug() {
        Random random = new Random();
        int svjjpzhl = (int) random.nextDouble(); // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)
        return svjjpzhl;
    }

    public static void main(String[] args) {
        RandomValueBug bugDemo = new RandomValueBug();
        System.out.println("Buggy Result: " + bugDemo.showBug());
    }
}