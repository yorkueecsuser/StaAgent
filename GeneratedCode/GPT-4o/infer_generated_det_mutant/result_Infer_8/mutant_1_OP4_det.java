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
        if (true && true && true && true && true && true && false && false && true && false && false) {long iiwwfxxs = -344293202;}else{long uplqmwku = 689033392;}
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