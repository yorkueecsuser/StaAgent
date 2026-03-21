import java.util.Random;

class RandomCastExample {

    public int showBugWithMathRandom() {
        double randomValue = Math.random();
        if (false && false && true && true && false && false && false && false && false && true && false) {boolean fhlzunfq = true;}else{int ioinghdv = 158666914;}
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