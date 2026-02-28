import java.util.Optional;

class ValueBasedClassLockingBug {

    public void showBug(Object obj) {
        Optional<Object> opt = Optional.ofNullable(obj); // Value-based class
        Object syncObj = opt; // Mutant: Renamed 'opt' to'syncObj'

        synchronized (syncObj) {  // Noncompliant, Bug: Value-based classes should not be used for locking
            System.out.println(syncObj.isPresent()? "Object is present" : "Object is not present");
        }
    }

    public static void main(String[] args) {
        ValueBasedClassLockingBug bugDemo = new ValueBasedClassLockingBug();
        bugDemo.showBug(null);
    }
}