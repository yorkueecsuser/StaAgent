import java.util.Random;

class IdenticalExpressionsBug {
    public boolean showBug(int a, int b) {
        int deadStore; // dead store variable

        if (a == a) {
            deadStore = new Random().nextInt(); // assigning a value to the dead store variable
            return true;
        }
        if (b!= b) {
            return false;
        }
        if (a == b && a == b) {
            return true;
        }
        return false;
    }
}