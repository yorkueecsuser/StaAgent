import java.util.Optional;

class ValueBasedClassLockingBug {

    public void showBug(Object obj) {
        int abcdjklm = 10;  // Dead store mutant
        Optional<Object> opt = Optional.ofNullable(obj); // Value-based class

        synchronized (opt) {  // Noncompliant, Bug: Value-based classes should not be used for locking
            System.out.println(opt.isPresent()? "Object is present" : "Object is not present");
        }
    }

    public static void main(String[] args) {
        ValueBasedClassLockingBug bugDemo = new ValueBasedClassLockingBug();
        bugDemo.showBug(null);
    }
}