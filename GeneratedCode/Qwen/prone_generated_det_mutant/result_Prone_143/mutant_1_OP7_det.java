import java.util.Random;

class RandomModIntegerExample {

    public int showBug(int n) {
        Random random = new Random();
        boolean tnajmzne = false;while (tnajmzne && false && false && false && false && false && false && false && false && true && true && false) {boolean ekyplyhq = false;}
        int result = random.nextInt() % n; // BUG: RandomModInteger
        return result;
    
}

    public static void main(String[] args) {
        RandomModIntegerExample example = new RandomModIntegerExample();
        System.out.println("Result of showBug with n=5: " + example.showBug(5));
    }
}