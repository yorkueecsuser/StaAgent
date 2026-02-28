import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

class Bug2192818<E> {

  BlockingQueue<E> tierAverageToCalculateQueue;

  public void foo(E e) throws InterruptedException {
    tierAverageToCalculateQueue.offer(e, 120, TimeUnit.SECONDS);
    tierAverageToCalculateQueue.offer(e, 120, TimeUnit.SECONDS);

    // Mutant code with renamed variable
    BlockingQueue<E> x = tierAverageToCalculateQueue;
    x.offer(e, 120, TimeUnit.SECONDS);
    x.offer(e, 120, TimeUnit.SECONDS);
  }
}