import java.util.Random;

class RandomCastBug {
    public static void main(String[] args) {
        Random random = new Random();
        int xluxayix = (int) random.nextDouble(); // BUG: RandomCast
        long jdbqssag = (long) random.nextDouble(); // BUG: RandomCast
        System.out.println("Random int: " + xluxayix);
        System.out.println("Random long: " + jdbqssag);
    }
}