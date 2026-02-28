import java.util.Optional;

class ValueBasedClassLockingBug {

    public void showBug(Object obj) {
        Optional<Object> opt = Optional.ofNullable(obj);
        Optional<Object> dupOpt = opt; // Mutant code added: Duplicating the assignment statement

        synchronized (opt) {
            System.out.println(opt.isPresent()? "Object is present" : "Object is not present");
        }

        synchronized (dupOpt) { // Using the duplicated assignment statement
            System.out.println(dupOpt.isPresent()? "Duplicate object is present" : "Duplicate object is not present");
        }
    }

    public static void main(String[] args) {
        ValueBasedClassLockingBug bugDemo = new ValueBasedClassLockingBug();
        bugDemo.showBug(null);
    }
}