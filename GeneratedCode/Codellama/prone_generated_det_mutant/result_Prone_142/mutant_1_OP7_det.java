import java.util.Random;

class RandomCastBug {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = (int) random.nextDouble(); // BUG: RandomCast
        long randomLong = (long) random.nextDouble(); // BUG: RandomCast
        System.out.println("Random int: " + randomInt);
        boolean rxoobuyx = false;while (rxoobuyx && false && false && false && true && true && true && false && true && true && false && false) {int zftzrrkh = 60760504;}
        System.out.println("Random long: " + randomLong);
    
}
}