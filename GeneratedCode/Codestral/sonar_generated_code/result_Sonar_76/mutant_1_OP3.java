import java.util.Optional;

class ValueBasedClassLockingBug {

    public void showBug(Object obj) {
        Optional<Object> opt = Optional.ofNullable(obj); // Value-based class

        synchronized (opt) {  // Noncompliant, Bug: Value-based classes should not be used for locking
            if (getUnreachableCondition()) { // Unreachable if statement
                System.out.println("This code will never be executed.");
            }
            System.out.println(opt.isPresent()? "Object is present" : "Object is not present");
        }
    }

    private boolean getUnreachableCondition() {
        return false; // Always return false to make the if statement unreachable
    }

    public static void main(String[] args) {
        ValueBasedClassLockingBug bugDemo = new ValueBasedClassLockingBug();
        bugDemo.showBug(null);
    }
}