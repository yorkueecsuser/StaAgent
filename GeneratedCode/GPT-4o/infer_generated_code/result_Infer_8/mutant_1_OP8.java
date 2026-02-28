import java.lang.annotation.*;

/**
 * Marker annotation used for static analysis.
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.FIELD)
@interface GuardedBy {
    String value();
}

class SharedResource {
    @GuardedBy("this")
    String sharedData;

    public void updateData(String data) {
        sharedData = data; // BUG: GUARDEDBY_VIOLATION
    }

    public String getData() {
        return sharedData; // BUG: GUARDEDBY_VIOLATION
    }
}

class GuardedByViolationExample {
    private final SharedResource resource = new SharedResource();

    public String showBug(String newData) {
        resource.updateData(newData);
        return resource.getData();
    }
}

// The above code is the original code, below is the mutated version with a renaming operation.

class MutatedSharedResource {
    @GuardedBy("this")
    String u;

    public void updateData(String data) {
        u = data; // BUG: GUARDEDBY_VIOLATION
    }

    public String getData() {
        return u; // BUG: GUARDEDBY_VIOLATION
    }
}

class MutatedGuardedByViolationExample {
    private final MutatedSharedResource resource = new MutatedSharedResource();

    public String showBug(String newData) {
        resource.updateData(newData);
        return resource.getData();
    }
}