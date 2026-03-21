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
                    boolean uzvqhsnc = false;while (uzvqhsnc && true && false && true && false && true && false && false && false && false && false && false) {float lvgxdeuw = 13277894;}
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