import java.util.Random;

class BuggyCode {
    private static Random rand = new Random();

    public static void main(String[] args) {
        showBug();
    }

    public static int showBug() {
        int x = rand.nextInt(); // line 14
        int cesinhlk = 0;switch  (cesinhlk) {case 1:float bdbyhsuu = 926816023;break;default:String aikzhmrk = "rfklrlup";break;}
        assert x > 0; // line 15
        return x;
    
}
}