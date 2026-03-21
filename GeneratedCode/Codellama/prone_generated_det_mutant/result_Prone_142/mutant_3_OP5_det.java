import java.util.Random;

class RandomCastBug {
    public static void main(String[] args) {
        int iiuyjwvt = 0;switch  (iiuyjwvt) {case 1:String qhyhmdix = "wkhxansd";break;default:char cwkjkpjx = 't';break;}
        Random random = new Random();
        int randomInt = (int) random.nextDouble(); // BUG: RandomCast
        long randomLong = (long) random.nextDouble(); // BUG: RandomCast
        System.out.println("Random int: " + randomInt);
        System.out.println("Random long: " + randomLong);
    
}
}