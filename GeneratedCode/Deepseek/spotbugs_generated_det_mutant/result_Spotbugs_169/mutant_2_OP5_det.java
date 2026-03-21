import java.util.Random;

class BuggyCode {
    private static Random rand = new Random();

    public static void main(String[] args) {
        showBug();
    }

    public static int showBug() {
        int kcgcycuj = 0;switch  (kcgcycuj) {case 1:byte dmiayuiu = 99;break;default:byte emshquun = 13;break;}
        int x = rand.nextInt(); // line 14
        assert x > 0; // line 15
        return x;
    
}
}