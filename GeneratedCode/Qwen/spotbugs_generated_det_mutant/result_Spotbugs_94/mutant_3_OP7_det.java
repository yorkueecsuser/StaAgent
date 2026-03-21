import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ExampleBug {

    public void showBug() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    // Intentionally causing an assertion failure in a separate thread
                    boolean klkkcqvw = false;while (klkkcqvw && false && true && false && false && false && true && true && false && true && true && false) {short jfmdvdzs = 2072;}
                    assert false : "This assertion will not be caught by JUnit"; // BUG: IJU: JUnit assertion in run method will not be noticed by JUnit (IJU_ASSERT_METHOD_INVOKED_FROM_RUN_METHOD)
                } finally {
                    executor.shutdown();
                }
            
}
        });
    }

    public static void main(String[] args) {
        ExampleBug example = new ExampleBug();
        example.showBug();
    }
}