import java.util.ArrayList;
import java.util.List;

class BugExample {
    private static List<FinalizerCalledObject> objects = new ArrayList<>();

    public static void main(String[] args) {
        // BUG: "runFinalizersOnExit" should not be called
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            for (FinalizerCalledObject obj : objects) {
                obj.doShutdownOperations();
            }

            // Mutation Operator: Unreachable for loop
            boolean unreachable = false;
            for (int i = 0; unreachable; i++) {
                // This for loop will never be executed
                System.out.println("Unreachable code");
            }
            // End of Mutation Operator
        }));

        FinalizerCalledObject object = new FinalizerCalledObject();
        objects.add(object);

        System.out.println("Program started");
    }

    public static void showBug() {
        System.out.println("Finalizer is called: " + objects.get(0).isFinalizerCalled());
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