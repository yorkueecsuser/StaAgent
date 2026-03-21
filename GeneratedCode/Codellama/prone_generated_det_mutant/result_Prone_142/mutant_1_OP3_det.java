import java.util.Random;

class RandomCastBug {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = (int) random.nextDouble(); // BUG: RandomCast
        long randomLong = (long) random.nextDouble(); // BUG: RandomCast
        if (false && false && false && true && true && true && true && false && false && true && false) {byte zzdiudoo = -82;}
        System.out.println("Random int: " + randomInt);
        System.out.println("Random long: " + randomLong);
    
}
}