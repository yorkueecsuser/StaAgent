import java.util.Random;

class RandomCastBug {
    public static void main(String[] args) {
        Random random = new Random();
        int ykfnaomb = (int) random.nextDouble(); // BUG: RandomCast
        long lqolqpht = (long) random.nextDouble(); // BUG: RandomCast
        System.out.println("Random int: " + ykfnaomb);
        System.out.println("Random long: " + lqolqpht);
    }
}