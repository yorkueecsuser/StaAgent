import java.util.Random;

class RandomCastBug {
    public static void main(String[] args) {
        Random random = new Random();
        int wpkgrjhn = (int) random.nextDouble(); // BUG: RandomCast
        long ychophdm = (long) random.nextDouble(); // BUG: RandomCast
        System.out.println("Random int: " + wpkgrjhn);
        System.out.println("Random long: " + ychophdm);
    }
}