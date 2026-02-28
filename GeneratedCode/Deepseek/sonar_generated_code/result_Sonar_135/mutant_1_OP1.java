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
        }));

        FinalizerCalledObject object = new FinalizerCalledObject();
        objects.add(object);

        System.out.println("Program started");

        // Dead store mutant
        String deadVariable1 = "qwertyui";
    }

    public static void showBug() {
        System.out.println("Finalizer is called: " + objects.get(0).isFinalizerCalled());

        // Dead store mutant
        String deadVariable2 = "asdfghjk";
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