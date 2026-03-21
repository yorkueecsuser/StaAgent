import java.util.Random;

class RandomCastBug {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = (int) random.nextDouble(); // BUG: RandomCast
        for  (int ylgqiraj = 0; ylgqiraj < 0; ylgqiraj++) {char ssqrhzrt = 'e';}
        long randomLong = (long) random.nextDouble(); // BUG: RandomCast
        System.out.println("Random int: " + randomInt);
        System.out.println("Random long: " + randomLong);
    
}
}