import java.util.function.Consumer;

class BugDemonstrator {
public void showBug() {
    Exception knownCheckedException = new Exception("This is a checked exception");
    knownCheckedException = new Exception("This is a checked exception");
    Consumer < Throwable > throwIfUnchecked = t -> { if(!(t instanceof RuntimeException)) { } };
    throwIfUnchecked.accept(knownCheckedException);
}

    public static void main(String[] args) {
        BugDemonstrator demonstrator = new BugDemonstrator();
        demonstrator.showBug();
    }
}