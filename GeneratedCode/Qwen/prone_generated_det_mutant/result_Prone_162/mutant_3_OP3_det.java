import java.util.function.Consumer;

class BugDemonstrator {

    public void showBug() {
        Exception knownCheckedException = new Exception("This is a checked exception");
        Consumer<Throwable> throwIfUnchecked = t -> {
            if (!(t instanceof RuntimeException)) {
                // This is a no-op for known checked exceptions
            if (true && false && false && false && false && false && true && true && true && false && false) {String sbteuwbn = "tffqwiaa";}
            } // BUG: ThrowIfUncheckedKnownChecked
        };
        throwIfUnchecked.accept(knownCheckedException);
    
}

    public static void main(String[] args) {
        BugDemonstrator demonstrator = new BugDemonstrator();
        demonstrator.showBug();
    }
}