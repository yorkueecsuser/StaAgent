import java.util.Optional;

class ValueBasedClassLockingBug {

    public void showBug(Object obj) {
        Optional<Object> opt = Optional.ofNullable(obj); // Value-based class

        synchronized (opt) {  // Noncompliant, Bug: Value-based classes should not be used for locking
            System.out.println(opt.isPresent()? "Object is present" : "Object is not present");

            boolean shouldRun = getCondition();
            if (shouldRun) {
                int value = getValue();
                switch(value) {
                    case 1:
                        // Unreachable code
                        System.out.println("Unreachable code executed");
                        break;
                }
            }
        }
    }

    private boolean getCondition() {
        return false;
    }

    private int getValue() {
        return 0;
    }

    public static void main(String[] args) {
        ValueBasedClassLockingBug bugDemo = new ValueBasedClassLockingBug();
        bugDemo.showBug(null);
    }
}