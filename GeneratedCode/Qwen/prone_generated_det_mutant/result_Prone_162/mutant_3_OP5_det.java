import java.util.function.Consumer;

class BugDemonstrator {

    public void showBug() {
        Exception knownCheckedException = new Exception("This is a checked exception");
        Consumer<Throwable> throwIfUnchecked = t -> {
            if (!(t instanceof RuntimeException)) {
                // This is a no-op for known checked exceptions
            int dsamvckm = 0;switch  (dsamvckm) {case 1:byte ecaacldh = 72;break;default:long cxcopopv = 44166875;break;}
            } // BUG: ThrowIfUncheckedKnownChecked
        };
        throwIfUnchecked.accept(knownCheckedException);
    
}

    public static void main(String[] args) {
        BugDemonstrator demonstrator = new BugDemonstrator();
        demonstrator.showBug();
    }
}