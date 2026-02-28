import java.util.Optional;

class ValueBasedClassLockingBug {

    private boolean getCondition() {
        return false;
    }

    public void showBug(Object obj) {
        Optional<Object> opt = Optional.ofNullable(obj);

        synchronized (opt) {
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
                // Unreachable code due to mutation operator
                System.out.println("This is unreachable code");
            }

            System.out.println(opt.isPresent()? "Object is present" : "Object is not present");
        }
    }

    public static void main(String[] args) {
        ValueBasedClassLockingBug bugDemo = new ValueBasedClassLockingBug();
        bugDemo.showBug(null);
    }
}