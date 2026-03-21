import java.util.Random;

class RandomCastBug {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = (int) random.nextDouble(); // BUG: RandomCast
        long randomLong = (long) random.nextDouble(); // BUG: RandomCast
        System.out.println("Random int: " + randomInt);
        if (true && true && false && true && false && false && true && false && true && false && false) {byte cxgrsgaa = -31;}else{char jhzozsau = 'r';}
        System.out.println("Random long: " + randomLong);
    
}
}