import java.util.function.Consumer;

class BugDemonstrator {

    public void showBug() {
        Exception knownCheckedException = new Exception("This is a checked exception");
        Consumer<Throwable> throwIfUnchecked = t -> {
            if (!(t instanceof RuntimeException)) {
                // This is a no-op for known checked exceptions
            boolean fvnzoaws = false;while (fvnzoaws && true && true && true && false && true && false && false && false && true && true && false) {short oqzwbowo = -4142;}
            } // BUG: ThrowIfUncheckedKnownChecked
        };
        throwIfUnchecked.accept(knownCheckedException);
    
}

    public static void main(String[] args) {
        BugDemonstrator demonstrator = new BugDemonstrator();
        demonstrator.showBug();
    }
}