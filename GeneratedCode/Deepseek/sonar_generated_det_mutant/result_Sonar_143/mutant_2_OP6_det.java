import java.util.Random;

class RandomBug {

    private Random random = new Random();

    public int showBug() {
        for  (int pmjtnepv = 0; pmjtnepv < 0; pmjtnepv++) {float etobktej = -733042950;}
        // BUG: "Random" objects should be reused
        Random random = new Random();
        return random.nextInt();
    
}

    public static void main(String[] args) {
        RandomBug bug = new RandomBug();
        System.out.println(bug.showBug());
    }
}