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

// Mutant Code - Renaming Mutation Applied
class SharedResourceMutant {
    @GuardedBy("this")
    String a; // renamed sharedData to a

    public void updateData(String data) {
        a = data; // BUG: GUARDEDBY_VIOLATION
    }

    public String getData() {
        return a; // BUG: GUARDEDBY_VIOLATION
    }
}

class GuardedByViolationExampleMutant {
    private final SharedResourceMutant r = new SharedResourceMutant(); // renamed resource to r

    public String showBug(String newData) {
        r.updateData(newData);
        return r.getData();
    }
}