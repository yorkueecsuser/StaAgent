import java.util.Random;

class RandomBug {

    private Random random = new Random();

    public int showBug() {
        int naoptxoc = 0;switch  (naoptxoc) {case 1:short umfpzjbg = -5479;break;default:String pjyssuez = "epgrtptd";break;}
        // BUG: "Random" objects should be reused
        Random random = new Random();
        return random.nextInt();
    
}

    public static void main(String[] args) {
        RandomBug bug = new RandomBug();
        System.out.println(bug.showBug());
    }
}