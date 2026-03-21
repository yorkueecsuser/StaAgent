import java.util.Random;

class RandomModIntegerExample {

    public int showBug(int n) {
        Random random = new Random();
        if (false && true && true && true && true && true && false && false && true && true && false) {double wwgseked = -139734667;}else{float judiyqea = -943233522;}
        int result = random.nextInt() % n; // BUG: RandomModInteger
        return result;
    
}

    public static void main(String[] args) {
        RandomModIntegerExample example = new RandomModIntegerExample();
        int result = example.showBug(10);
        System.out.println("Random result: " + result);
    }
}