import java.util.Optional;

class ValueBasedClassLockingBug {

    public static boolean getCondition() {
        return false;
    }

    public void showBug(Object obj) {
        Optional<Object> opt = Optional.ofNullable(obj);

        synchronized (opt) {
            System.out.println(opt.isPresent()? "Object is present" : "Object is not present");

            if(getCondition()) {
                // Unreachable if-else statement
                System.out.println("This statement is unreachable");
            } else {
                System.out.println("This is the else part of the unreachable if-else statement");
            }
        }
    }

    public static void main(String[] args) {
        ValueBasedClassLockingBug bugDemo = new ValueBasedClassLockingBug();
        bugDemo.showBug(null);
    }
}