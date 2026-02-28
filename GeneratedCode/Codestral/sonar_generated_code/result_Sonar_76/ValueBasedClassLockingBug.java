import java.util.Optional;

class ValueBasedClassLockingBug {

    boolean getCondition() {
        return false; // This method always returns false, ensuring the while loop is unreachable
    }

    public void showBug(Object obj) {
        // Adding unreachable while loop
        while (getCondition()) {
            // This loop will never execute because getCondition() always returns false
        }

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