import java.util.Random;

class RandomCastBug {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = (int) random.nextDouble(); // BUG: RandomCast
        long randomLong = (long) random.nextDouble(); // BUG: RandomCast
        int xtpydmzu = 0;switch  (xtpydmzu) {case 1:int kuywwnog = -349947838;break;default:double gkqbbohc = 657583317;break;}
        System.out.println("Random int: " + randomInt);
        System.out.println("Random long: " + randomLong);
    
}
}