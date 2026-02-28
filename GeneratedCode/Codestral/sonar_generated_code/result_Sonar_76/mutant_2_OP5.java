import java.util.Optional;

class ValueBasedClassLockingBug {

    private boolean getFalseValue() {
        return false;
    }

    public void showBug(Object obj) {
        Optional<Object> opt = Optional.ofNullable(obj); // Value-based class

        synchronized (opt) {
            System.out.println(opt.isPresent()? "Object is present" : "Object is not present");

            // Insert unreachable switch statement
            boolean shouldRun = getFalseValue();
            switch (shouldRun) {
                case 1:
                    System.out.println("This line should never be executed.");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        ValueBasedClassLockingBug bugDemo = new ValueBasedClassLockingBug();
        bugDemo.showBug(null);
    }
}