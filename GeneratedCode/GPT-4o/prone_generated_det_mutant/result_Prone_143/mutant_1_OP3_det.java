import java.util.Random;

class RandomModIntegerExample {

    public int showBug(int n) {
        Random random = new Random();
        if (true && true && true && false && false && false && false && false && false && false && false) {short gmqsayfc = 8934;}
        int result = random.nextInt() % n; // BUG: RandomModInteger
        return result;
    
}

    public static void main(String[] args) {
        RandomModIntegerExample example = new RandomModIntegerExample();
        int result = example.showBug(10);
        System.out.println("Random result: " + result);
    }
}