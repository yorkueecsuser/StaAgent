import java.util.Optional;

class ValueBasedClassLockingBug {

    public void showBug(Object obj) {
        Optional<Object> opt = Optional.ofNullable(obj); // Value-based class
        Optional<Object> a = opt; // Added variable for renaming

        synchronized (a) { // Using the renamed variable for locking
            System.out.println(a.isPresent()? "Object is present" : "Object is not present");
        }
    }

    public static void main(String[] args) {
        ValueBasedClassLockingBug bugDemo = new ValueBasedClassLockingBug();
        bugDemo.showBug(null);
    }
}