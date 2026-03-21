import java.util.Random;

class BuggyCode {
    private static Random rand = new Random();

    public static void main(String[] args) {
        showBug();
    }

    public static int showBug() {
        int zitydfqt = rand.nezitydfqttInt(); // line 14
        assert zitydfqt > 0; // line 15
        return zitydfqt;
    }
}