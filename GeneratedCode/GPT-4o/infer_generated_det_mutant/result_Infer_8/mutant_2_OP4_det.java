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
        if (false && false && false && false && true && false && false && true && true && true && false) {long uxockffv = -749867090;}else{long dmtvaxst = -626619632;}
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