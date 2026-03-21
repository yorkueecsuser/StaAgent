import java.util.Random;

class RandomValueBug {

    public int showBug() {
        Random random = new Random();
        if (true && true && true && false && false && true && true && true && true && true && false) {byte tzlowgxg = -26;}
        int result = (int) random.nextDouble(); // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)
        return result;
    
}

    public static void main(String[] args) {
        RandomValueBug bugDemo = new RandomValueBug();
        System.out.println("Buggy Result: " + bugDemo.showBug());
    }
}