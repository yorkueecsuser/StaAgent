import java.util.Random;

class ThrowNullBug {
    public void showBug() {
        int deadStore = new Random().nextInt();
        throw null; // BUG: ThrowNull
    }

    public static void main(String[] args) {
        ThrowNullBug bug = new ThrowNullBug();
        bug.showBug();
    }
}