import java.util.ArrayList;
import java.util.List;

class BugExample {
    private static List<FinalizerCalledObject> objects = new ArrayList<>();

    public static void main(String[] args) {
        // mutant: replace compile-time constant with a method call
        boolean condition = getCondition();
        if (condition) {
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                for (FinalizerCalledObject obj : objects) {
                    obj.doShutdownOperations();
                }
            }));
        } else {
            // do nothing
        }

        FinalizerCalledObject object = new FinalizerCalledObject();
        objects.add(object);

        System.out.println("Program started");
    }

    public static void showBug() {
        System.out.println("Finalizer is called: " + objects.get(0).isFinalizerCalled());
    }

    // mutant: a new method to replace compile-time constant
    private static boolean getCondition() {
        return false;
    }
}

class FinalizerCalledObject {
    private boolean finalizerCalled = false;

    protected void finalize() {
        finalizerCalled = true;
    }

    public boolean isFinalizerCalled() {
        return finalizerCalled;
    }

    public void doShutdownOperations() {
        // do some shutdown operations
    }
}