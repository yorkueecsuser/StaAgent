import java.util.Optional;

class ValueBasedClassLockingBug {

    public void showBug(Object obj) {
        Optional<Object> opt = Optional.ofNullable(obj); // Value-based class

        synchronized (opt) {  // Noncompliant, Bug: Value-based classes should not be used for locking
            System.out.println(opt.isPresent()? "Object is present" : "Object is not present");
        }

        // Mutant code: Unreachable if statement
        boolean condition = false;
        if (condition) {
            System.out.println("This code is unreachable");
        }
    }

    public static void main(String[] args) {
        ValueBasedClassLockingBug bugDemo = new ValueBasedClassLockingBug();
        bugDemo.showBug(null);
    }
}