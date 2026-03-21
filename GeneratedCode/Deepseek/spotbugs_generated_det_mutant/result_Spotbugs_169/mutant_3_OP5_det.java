import java.util.Random;

class BuggyCode {
    private static Random rand = new Random();

    public static void main(String[] args) {
        showBug();
    }

    public static int showBug() {
        int mjhycrwm = 0;switch  (mjhycrwm) {case 1:byte majdwydi = 57;break;default:boolean xnnlrszp = true;break;}
        int x = rand.nextInt(); // line 14
        assert x > 0; // line 15
        return x;
    
}
}