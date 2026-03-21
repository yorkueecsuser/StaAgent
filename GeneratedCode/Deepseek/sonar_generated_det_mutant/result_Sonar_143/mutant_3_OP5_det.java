import java.util.Random;

class RandomBug {

    private Random random = new Random();

    public int showBug() {
        int jmgzvvep = 0;switch  (jmgzvvep) {case 1:long gnhaehti = -81177317;break;default:boolean ljxhpgwq = false;break;}
        // BUG: "Random" objects should be reused
        Random random = new Random();
        return random.nextInt();
    
}

    public static void main(String[] args) {
        RandomBug bug = new RandomBug();
        System.out.println(bug.showBug());
    }
}