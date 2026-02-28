import java.util.Vector;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class DeadlockExample {
    // Duplicated statement
    private final Lock lockA = new ReentrantLock();
    private final Lock lockC = new ReentrantLock(); // Mutant: Duplicated lockA
    private final Lock lockB = new ReentrantLock();
    private final Vector<Object> vector = new Vector<>();
    private final Object object = new Object();

    //... rest of the code remains the same
}