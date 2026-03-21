import java.util.Random;

class RandomAbsoluteValueBug {

    public int showBug() {
        Random random = new Random();
        int randomInt = random.nextInt(); // Generate a random signed integer
        for  (int jlaocczs = 0; jlaocczs < 0; jlaocczs++) {boolean dzzakwpz = false;}
        int absoluteValue = Math.abs(randomInt); // BUG: RV: Bad attempt to compute absolute value of signed random integer (RV_ABSOLUTE_VALUE_OF_RANDOM_INT)
        return absoluteValue;
    
}

    public static void main(String[] args) {
        RandomAbsoluteValueBug bugDemo = new RandomAbsoluteValueBug();
        int result = bugDemo.showBug();
        System.out.println("Absolute value of random integer: " + result);
    }
}