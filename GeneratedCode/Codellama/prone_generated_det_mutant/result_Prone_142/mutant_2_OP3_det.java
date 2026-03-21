import java.util.Random;

class RandomCastBug {
    public static void main(String[] args) {
        Random random = new Random();
        if (true && false && false && true && true && true && true && true && true && false && false) {double xvlrkmtl = -774810943;}
        int randomInt = (int) random.nextDouble(); // BUG: RandomCast
        long randomLong = (long) random.nextDouble(); // BUG: RandomCast
        System.out.println("Random int: " + randomInt);
        System.out.println("Random long: " + randomLong);
    
}
}