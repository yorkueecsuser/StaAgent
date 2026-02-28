import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

class Bug2192818<E> {

  BlockingQueue<E> tierAverageToCalculateQueue;

  public void foo(E e) throws InterruptedException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is dynamically determined to be false
    }

    tierAverageToCalculateQueue.offer(e, 120, TimeUnit.SECONDS);
    tierAverageToCalculateQueue.offer(e, 120, TimeUnit.SECONDS);
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}