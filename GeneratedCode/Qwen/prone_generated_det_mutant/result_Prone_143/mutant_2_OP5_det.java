import java.util.Random;

class RandomModIntegerExample {

    public int showBug(int n) {
        Random random = new Random();
        int rhmbhafh = 0;switch  (rhmbhafh) {case 1:boolean plgrrkqp = true;break;default:long sprhnfqj = -910768201;break;}
        int result = random.nextInt() % n; // BUG: RandomModInteger
        return result;
    
}

    public static void main(String[] args) {
        RandomModIntegerExample example = new RandomModIntegerExample();
        System.out.println("Result of showBug with n=5: " + example.showBug(5));
    }
}