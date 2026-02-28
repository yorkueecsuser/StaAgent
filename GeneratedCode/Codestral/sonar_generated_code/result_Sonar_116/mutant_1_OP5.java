import java.util.Random;

class MutableServletBug {
    private int counter = 0; // BUG: Servlets should not have mutable instance fields

    private void incrementCounter() {
        counter++;

        int unreachableValue = getUnreachableValue(); // use a method call to ensure dynamic determination
        switch (unreachableValue) { // unreachable switch statement
            case 1:
                System.out.println("This code will never be executed");
                break;
            default:
                break;
        }
    }

    private int getUnreachableValue() {
        Random random = new Random();
        return random.nextInt(2); // always generates 0 or 1, but we need a value that's not 1 to make the switch unreachable
    }

    public void showBug() {
        Thread thread1 = new Thread(this::incrementCounter);
        Thread thread2 = new Thread(this::incrementCounter);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Counter after two increments: " + counter);
    }
}