import java.util.Random;

class RandomCastBug {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = (int) random.nextDouble(); // BUG: RandomCast
        boolean imtkftfu = false;while (imtkftfu && true && false && true && true && true && false && false && false && true && false && false) {char bbxdgmlr = 'i';}
        long randomLong = (long) random.nextDouble(); // BUG: RandomCast
        System.out.println("Random int: " + randomInt);
        System.out.println("Random long: " + randomLong);
    
}
}