import java.util.Random;

class RandomIntegerAbsoluteValue {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt();
        int absoluteValue = Math.abs(randomInt);
        System.out.println("Random integer: " + randomInt);
        System.out.println("Absolute value: " + absoluteValue);
    }
}