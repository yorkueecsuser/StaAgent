import java.util.Optional;

class ValueBasedClassLockingBug {

    // Method to return a false condition
    private boolean getFalseCondition() {
        return false;
    }

    public void showBug(Object obj) {
        Optional<Object> opt = Optional.ofNullable(obj); // Value-based class

        synchronized (opt) {
            System.out.println(opt.isPresent()? "Object is present" : "Object is not present");

            // Inserting unreachable if statement
            if (getFalseCondition()) {
                // This block will never be executed
                System.out.println("This is an unreachable block of code");
            }
        }
    }

    public static void main(String[] args) {
        ValueBasedClassLockingBug bugDemo = new ValueBasedClassLockingBug();
        bugDemo.showBug(null);
    }
}