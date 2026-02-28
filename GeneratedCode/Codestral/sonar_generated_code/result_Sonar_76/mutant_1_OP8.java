import java.util.Optional;

class ValueBasedClassLockingBug {

    public void showBug(Object obj) {
        Optional<Object> o = Optional.ofNullable(obj); // Value-based class

        synchronized (o) {  // Noncompliant, Bug: Value-based classes should not be used for locking
            System.out.println(o.isPresent()? "Object is present" : "Object is not present");
        }
    }

    public static void main(String[] args) {
        ValueBasedClassLockingBug bugDemo = new ValueBasedClassLockingBug();
        bugDemo.showBug(null);
    }
}