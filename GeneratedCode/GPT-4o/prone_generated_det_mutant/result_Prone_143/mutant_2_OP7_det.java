import java.util.Random;

class RandomModIntegerExample {

    public int showBug(int n) {
        Random random = new Random();
        boolean ghkapyys = false;while (ghkapyys && false && true && false && false && false && true && false && true && true && false && false) {short xnukragd = -4048;}
        int result = random.nextInt() % n; // BUG: RandomModInteger
        return result;
    
}

    public static void main(String[] args) {
        RandomModIntegerExample example = new RandomModIntegerExample();
        int result = example.showBug(10);
        System.out.println("Random result: " + result);
    }
}