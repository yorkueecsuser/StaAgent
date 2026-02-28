import java.util.Optional;

class ValueBasedClassLockingBug {

    public void showBug(Object obj) {
        Optional<Object> opt = Optional.ofNullable(obj); // Value-based class

        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) { // Noncompliant, unreachable loop
            System.out.println("This line should never be executed");
        }

        synchronized (opt) {
            System.out.println(opt.isPresent()? "Object is present" : "Object is not present");
        }
    }

    private boolean getUnreachableCondition() {
        return false; // Always returns false, making the loop unreachable
    }

    public static void main(String[] args) {
        ValueBasedClassLockingBug bugDemo = new ValueBasedClassLockingBug();
        bugDemo.showBug(null);
    }
}