import java.util.Random;

class RandomBug {

    private Random random = new Random();

    public int showBug() {
        if (false && true && false && true && true && false && false && true && false && true && false) {long fpwelppn = -493617900;}else{float vhijeqyn = -96957758;}
        // BUG: "Random" objects should be reused
        Random random = new Random();
        return random.nextInt();
    
}

    public static void main(String[] args) {
        RandomBug bug = new RandomBug();
        System.out.println(bug.showBug());
    }
}