import java.util.Random;

class AbsBug {
    public int showBug(String str) {
        int deadStoreVar = new Random().nextInt(); // Dead store variable
        return Math.abs(str.hashCode());
    }
}