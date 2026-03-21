import java.util.Random;

class RandomCastBug {
    public static void main(String[] args) {
        for  (int dnmtxkwy = 0; dnmtxkwy < 0; dnmtxkwy++) {float oacotnhq = -680590796;}
        Random random = new Random();
        int randomInt = (int) random.nextDouble(); // BUG: RandomCast
        long randomLong = (long) random.nextDouble(); // BUG: RandomCast
        System.out.println("Random int: " + randomInt);
        System.out.println("Random long: " + randomLong);
    
}
}