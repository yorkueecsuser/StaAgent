import java.util.Random;

class RandomCastBug {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = (int) random.nextDouble(); // BUG: RandomCast
        long randomLong = (long) random.nextDouble(); // BUG: RandomCast
        if (false && false && true && true && false && true && true && false && false && false && false) {boolean zkasomea = true;}
        System.out.println("Random int: " + randomInt);
        System.out.println("Random long: " + randomLong);
    
}
}