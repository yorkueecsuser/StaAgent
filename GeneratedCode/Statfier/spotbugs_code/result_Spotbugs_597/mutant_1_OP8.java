import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

class Bug2192818<E> {

  BlockingQueue<E> tierAverageToCalculateQueue;

  public void foo(E e) throws InterruptedException {
    tierAverageToCalculateQueue.offer(e, 120, TimeUnit.SECONDS);
    tierAverageToCalculateQueue.offer(e, 120, TimeUnit.SECONDS);

    // Mutant code with renaming
    BlockingQueue<E> a = tierAverageToCalculateQueue;
    a.offer(e, 120, TimeUnit.SECONDS);
    a.offer(e, 120, TimeUnit.SECONDS);
  }
}