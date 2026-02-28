import java.util.ArrayList;
import java.util.List;

class BugExample {
    private static List<FinalizerCalledObject> objects = new ArrayList<>();

    public static void main(String[] args) {
        // BUG: "runFinalizersOnExit" should not be called
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            String randomString = ""; // Mutation: Inserted a dead store
            for (FinalizerCalledObject obj : objects) {
                obj.doShutdownOperations();
            }
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