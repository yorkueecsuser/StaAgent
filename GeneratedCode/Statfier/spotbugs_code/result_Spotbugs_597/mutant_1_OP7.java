import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

class Bug2192818<E> {

  BlockingQueue<E> tierAverageToCalculateQueue;

  public void foo(E e) throws InterruptedException {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will always return false
    }

    tierAverageToCalculateQueue.offer(e, 120, TimeUnit.SECONDS);
    tierAverageToCalculateQueue.offer(e, 120, TimeUnit.SECONDS);
  }

  private boolean getCondition() {
    // This method ensures the condition is dynamically determined at runtime and always returns false
    return false;
  }
}