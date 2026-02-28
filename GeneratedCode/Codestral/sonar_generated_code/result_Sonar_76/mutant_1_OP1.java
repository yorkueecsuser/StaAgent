import java.util.Optional;
import java.util.Random;

class ValueBasedClassLockingBug {

    public void showBug(Object obj) {
        Optional<Object> opt = Optional.ofNullable(obj); // Value-based class

        int deadStoreVariable; // Noncompliant, Dead Store
        Random rand = new Random();
        deadStoreVariable = rand.nextInt(100);

        synchronized (opt) {  // Noncompliant, Bug: Value-based classes should not be used for locking
            System.out.println(opt.isPresent()? "Object is present" : "Object is not present");
        }
    }

    public static void main(String[] args) {
        ValueBasedClassLockingBug bugDemo = new ValueBasedClassLockingBug();
        bugDemo.showBug(null);
    }
}