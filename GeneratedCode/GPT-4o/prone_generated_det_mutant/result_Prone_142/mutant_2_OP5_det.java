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
        int cxlfijkd = 0;switch  (cxlfijkd) {case 1:byte gojivqvw = 3;break;default:short vwujsfkl = -4405;break;}
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