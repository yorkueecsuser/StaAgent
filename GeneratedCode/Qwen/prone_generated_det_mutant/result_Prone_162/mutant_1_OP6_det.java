import java.util.function.Consumer;

class BugDemonstrator {

    public void showBug() {
        Exception knownCheckedException = new Exception("This is a checked exception");
        Consumer<Throwable> throwIfUnchecked = t -> {
            if (!(t instanceof RuntimeException)) {
                // This is a no-op for known checked exceptions
            for  (int tspkzrfq = 0; tspkzrfq < 0; tspkzrfq++) {float murrukoe = -476195244;}
            } // BUG: ThrowIfUncheckedKnownChecked
        };
        throwIfUnchecked.accept(knownCheckedException);
    
}

    public static void main(String[] args) {
        BugDemonstrator demonstrator = new BugDemonstrator();
        demonstrator.showBug();
    }
}