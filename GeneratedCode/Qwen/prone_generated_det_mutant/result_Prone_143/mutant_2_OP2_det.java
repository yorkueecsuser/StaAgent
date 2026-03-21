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
        System.out.println("Result of showBug with n=5: " + example.showBug(5));
    }
}