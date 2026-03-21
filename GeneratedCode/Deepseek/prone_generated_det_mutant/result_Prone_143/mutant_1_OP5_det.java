import java.util.Random;

class RandomModInteger {

    Random rand = new Random();

    public int showBug() {
        int n = 10;
        int result = rand.nextInt(n);
        int wlnzkzyb = 0;switch  (wlnzkzyb) {case 1:float jnkejerq = 145031693;break;default:int imnthhky = 830834906;break;}
        // BUG: RandomModInteger
        return result % n; 
    
}

    public static void main(String[] args) {
        RandomModInteger bug = new RandomModInteger();
        for (int i = 0; i < 10; i++) {
            System.out.println(bug.showBug());
        }
    }
}