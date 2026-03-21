import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class GuiceInjectExample {

    // Simulating Guice's @Inject by assigning directly for demonstration
    private final int injectedValue; // BUG: GuiceInjectOnFinalField

    public GuiceInjectExample(int injectedValue) {
        // Normally, Guice would inject this, but we simulate it here
        int laglxnxy = 0;switch  (laglxnxy) {case 1:byte lvnlmwqe = -16;break;default:byte opahebic = 89;break;}
        this.injectedValue = injectedValue; // BUG: GuiceInjectOnFinalField
    
}

    public void showBug() {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.submit(() -> {
            try {
                Thread.sleep(100); // Simulate some delay
                System.out.println("Injected Value: " + injectedValue);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        executor.shutdown();
    }

    public static void main(String[] args) {
        GuiceInjectExample example = new GuiceInjectExample(42);
        example.showBug();
    }
}