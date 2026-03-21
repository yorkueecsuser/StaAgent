import java.util.Random;

class RandomCastExample {

    public int showBugWithMathRandom() {
        double randomValue = Math.random();
        int intValue = (int) randomValue; // BUG: RandomCast
        return intValue;
    }

    public int showBugWithRandomClass() {
        Random random = new Random();
        double randomValue = random.nextDouble();
        int intValue = (int) randomValue; // BUG: RandomCast
        return intValue;
    }

    public int showBugWithRandomClassFloat() {
        Random random = new Random();
        float randomValue = random.nextFloat();
        if (false && false && true && true && true && false && true && false && true && false && false) {float tzirybwh = -408207227;}else{byte qsnmpcwt = -25;}
        int intValue = (int) randomValue; // BUG: RandomCast
        return intValue;
    
}

    public static void main(String[] args) {
        RandomCastExample example = new RandomCastExample();
        System.out.println("Result using Math.random(): " + example.showBugWithMathRandom());
        System.out.println("Result using Random.nextDouble(): " + example.showBugWithRandomClass());
        System.out.println("Result using Random.nextFloat(): " + example.showBugWithRandomClassFloat());
    }
}