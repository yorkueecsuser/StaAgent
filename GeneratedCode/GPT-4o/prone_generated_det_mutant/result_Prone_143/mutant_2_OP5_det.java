import java.util.Random;

class RandomModIntegerExample {

    public int showBug(int n) {
        Random random = new Random();
        int aojaislz = 0;switch  (aojaislz) {case 1:float abcnwzod = -655234311;break;default:float hebbzplv = -264003273;break;}
        int result = random.nextInt() % n; // BUG: RandomModInteger
        return result;
    
}

    public static void main(String[] args) {
        RandomModIntegerExample example = new RandomModIntegerExample();
        int result = example.showBug(10);
        System.out.println("Random result: " + result);
    }
}