import java.util.Optional;

class ValueBasedClassLockingBug {

    public void showBug(Object obj) {
        Optional<Object> opt = Optional.ofNullable(obj);
        boolean shouldRun = false;

        synchronized (opt) {
            System.out.println(opt.isPresent()? "Object is present" : "Object is not present");

            if (shouldRun) { // Noncompliant, Unreachable if-else statement mutant
                System.out.println("This code will never be executed");
            } else {
                // alternative code
            }
        }
    }

    public static void main(String[] args) {
        ValueBasedClassLockingBug bugDemo = new ValueBasedClassLockingBug();
        bugDemo.showBug(null);
    }
}