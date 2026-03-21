import java.util.Random;

class RandomModIntegerExample {

    public int showBug(int n) {
        Random random = new Random();
        for  (int svvizujw = 0; svvizujw < 0; svvizujw++) {double hqnvksmy = -155730669;}
        int result = random.nextInt() % n; // BUG: RandomModInteger
        return result;
    
}

    public static void main(String[] args) {
        RandomModIntegerExample example = new RandomModIntegerExample();
        System.out.println("Result of showBug with n=5: " + example.showBug(5));
    }
}