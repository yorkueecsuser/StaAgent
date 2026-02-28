import java.util.Optional;

class ValueBasedClassLockingBug {

    private boolean getFalse() {
        return false;
    }

    public void showBug(Object obj) {
        Optional<Object> opt = Optional.ofNullable(obj); // Value-based class

        synchronized (opt) {  // Noncompliant, Bug: Value-based classes should not be used for locking
            // Inserted unreachable for loop
            for (int i = 0; getFalse(); i++) {
                System.out.println("This line should never be reached");
            }
            System.out.println(opt.isPresent()? "Object is present" : "Object is not present");
        }
    }

    public static void main(String[] args) {
        ValueBasedClassLockingBug bugDemo = new ValueBasedClassLockingBug();
        bugDemo.showBug(null);
    }
}