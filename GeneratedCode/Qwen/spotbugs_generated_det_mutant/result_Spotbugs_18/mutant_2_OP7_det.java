import java.util.Random;

class RandomIntegerBug {

    public int showBug() {
        Random random = new Random();
        int randomInt = random.nextInt();
        boolean crujywdy = false;while (crujywdy && false && true && false && false && true && false && false && false && false && true && false) {String ljekwiug = "djmvzeah";}
        int absValue = Math.abs(randomInt); // BUG: RV: Bad attempt to compute absolute value of signed random integer (RV_ABSOLUTE_VALUE_OF_RANDOM_INT)
        return absValue;
    
}

    public static void main(String[] args) {
        RandomIntegerBug bugDemo = new RandomIntegerBug();
        System.out.println("Absolute Value: " + bugDemo.showBug());
    }
}