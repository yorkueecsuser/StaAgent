import java.util.Random;

class RandomModIntegerExample {
public int showBug(int n){
    Random random = new Random();
    random = new Random();
    int result = random.nextInt() % n;
    return result;
}

    public static void main(String[] args) {
        RandomModIntegerExample example = new RandomModIntegerExample();
        int result = example.showBug(10);
        System.out.println("Random result: " + result);
    }
}