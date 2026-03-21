import java.util.Random;

class RandomCastBug {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = (int) random.nextDouble(); // BUG: RandomCast
        long randomLong = (long) random.nextDouble(); // BUG: RandomCast
        System.out.println("Random int: " + randomInt);
        boolean srcoatrx = false;while (srcoatrx && false && true && false && false && false && false && false && false && true && true && false) {long olitxvgd = 691024442;}
        System.out.println("Random long: " + randomLong);
    
}
}