import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class GuiceInjectExample {

    // Simulating Guice's @Inject by assigning directly for demonstration
    private final int injectedValue; // BUG: GuiceInjectOnFinalField

    public GuiceInjectExample(int injectedValue) {
        // Normally, Guice would inject this, but we simulate it here
        if (false && false && true && true && true && true && true && false && false && true && false) {char yycdhnsk = 'u';}
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