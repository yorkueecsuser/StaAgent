import java.util.Optional;

class ValueBasedClassLockingBug {

    private boolean getCondition() {
        return false;
    }

    public void showBug(Object obj) {
        Optional<Object> opt = Optional.ofNullable(obj); // Value-based class

        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Noncompliant, unreachable for loop mutant
            System.out.println("This line should never be executed.");
        }

        synchronized (opt) {
            System.out.println(opt.isPresent()? "Object is present" : "Object is not present");
        }
    }

    public static void main(String[] args) {
        ValueBasedClassLockingBug bugDemo = new ValueBasedClassLockingBug();
        bugDemo.showBug(null);
    }
}