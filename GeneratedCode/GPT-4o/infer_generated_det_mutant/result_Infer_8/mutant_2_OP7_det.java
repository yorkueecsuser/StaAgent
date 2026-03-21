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
        boolean daetodtm = false;while (daetodtm && false && false && false && true && true && false && true && true && false && true && false) {long bddemcaz = -939446248;}
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