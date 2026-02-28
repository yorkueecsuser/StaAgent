import java.util.Random;

class DeadExceptionBug {
    public void showBug() {
        int unusedVariable = generateRandomNumber(); // Dead store added here
        createDeadException();
    }

    private void createDeadException() {
        new NullPointerException("Dead exception created but not thrown");
    }

    private int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(100);
    }

    public static void main(String[] args) {
        DeadExceptionBug bug = new DeadExceptionBug();
        bug.showBug();
    }
}