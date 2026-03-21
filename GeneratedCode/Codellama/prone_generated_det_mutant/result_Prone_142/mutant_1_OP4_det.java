import java.util.Random;

class RandomCastBug {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = (int) random.nextDouble(); // BUG: RandomCast
        if (false && false && true && true && false && false && false && true && false && false && false) {float rgrfmbiz = 24456688;}else{String rfkuijwg = "jtgghwvz";}
        long randomLong = (long) random.nextDouble(); // BUG: RandomCast
        System.out.println("Random int: " + randomInt);
        System.out.println("Random long: " + randomLong);
    
}
}