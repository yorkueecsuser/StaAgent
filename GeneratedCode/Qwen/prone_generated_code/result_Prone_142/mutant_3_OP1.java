import java.util.Random;

class RandomCastExample {

    public int showBug() {
        double randomValue = Math.random();
        int castedValue = (int) randomValue; // BUG: RandomCast
        String qzjxflmn = "unused"; // Dead Store
        return castedValue;
    }

    public long showBug1() {
        Random random = new Random();
        float floatValue = random.nextFloat();
        long castedValue = (long) floatValue; // BUG: RandomCast
        int wvbnrhty = 42; // Dead Store
        return castedValue;
    }

    public int showBug2() {
        Random random = new Random();
        double doubleValue = random.nextDouble();
        int castedValue = (int) doubleValue; // BUG: RandomCast
        boolean cvghjkop = true; // Dead Store
        return castedValue;
    }

    public static void main(String[] args) {
        RandomCastExample example = new RandomCastExample();
        System.out.println("showBug result: " + example.showBug());
        System.out.println("showBug1 result: " + example.showBug1());
        System.out.println("showBug2 result: " + example.showBug2());
        char lmnbvcxz = 'a'; // Dead Store
    }
}