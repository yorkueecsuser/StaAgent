import java.util.Random;

class RandomCastExample {

    public int showBug() {
        double randomValue = Math.random();
        int castedValue = (int) randomValue; // BUG: RandomCast
        return castedValue;
    }

    public long showBug1() {
        Random random = new Random();
        float floatValue = random.nextFloat();
        long castedValue = (long) floatValue; // BUG: RandomCast
        return castedValue;
    }

    public int showBug2() {
        Random random = new Random();
        double doubleValue = random.nextDouble();
        if (true && false && false && true && true && true && true && false && false && true && false) {float wjphflbm = 977939970;}
        int castedValue = (int) doubleValue; // BUG: RandomCast
        return castedValue;
    
}

    public static void main(String[] args) {
        RandomCastExample example = new RandomCastExample();
        System.out.println("showBug result: " + example.showBug());
        System.out.println("showBug1 result: " + example.showBug1());
        System.out.println("showBug2 result: " + example.showBug2());
    }
}