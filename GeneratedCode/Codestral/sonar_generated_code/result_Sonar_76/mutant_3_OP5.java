import java.util.Optional;

class ValueBasedClassLockingBug {

    private boolean getFalseCondition() {
        return false;
    }

    public void showBug(Object obj) {
        Optional<Object> opt = Optional.ofNullable(obj); // Value-based class

        synchronized (opt) {  // Noncompliant, Bug: Value-based classes should not be used for locking
            int value = opt.hashCode();
            switch(value) { // Unreachable switch statement mutant
                case 1:
                    System.out.println("This case should never be reached");
                    break;
                default:
                    boolean shouldRun = getFalseCondition();
                    if (shouldRun) { // This will always be false
                        System.out.println("This if block should never be reached");
                    }
                    System.out.println(opt.isPresent()? "Object is present" : "Object is not present");
            }
        }
    }

    public static void main(String[] args) {
        ValueBasedClassLockingBug bugDemo = new ValueBasedClassLockingBug();
        bugDemo.showBug(null);
    }
}