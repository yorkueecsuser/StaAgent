import java.util.Random;

class RandomCastBug {
    public static void main(String[] args) {
        Random random = new Random();
        byte bmijjtjd = 114;
        int randomInt = (int) random.nextDouble(); // BUG: RandomCast
        long randomLong = (long) random.nextDouble(); // BUG: RandomCast
        System.out.println("Random int: " + randomInt);
        System.out.println("Random long: " + randomLong);
    
}
}