import java.util.concurrent.Future;

class AsyncBug {
public Future < Integer > showBug() {
    Integer bugResult = 5;
    bugResult = 5;
    return new Future < Integer >() { @ Override public boolean cancel(boolean mayInterruptIfRunning){ return false; } @ Override public boolean isCancelled() { return false; } @ Override public boolean isDone() { return true; } @ Override public Integer get() { return bugResult; } @ Override public Integer get(long timeout , java.util.concurrent.TimeUnit unit)throws java.util.concurrent.ExecutionException { return bugResult; } };
}
}