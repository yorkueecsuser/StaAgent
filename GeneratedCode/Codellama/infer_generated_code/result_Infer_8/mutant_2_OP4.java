import com.facebook.infer.annotation.*;
import java.lang.annotation.*;
import java.util.*;

/**
 * Marker annotation used for static analysis.
 */
@Retention(RetentionPolicy.CLASS)
@Target({
    ElementType.TYPE,
    ElementType.METHOD,
    ElementType.FIELD,
    ElementType.CONSTRUCTOR,
    ElementType.PARAMETER
})
@interface GuardedBy {
    String value();
}

@GuardedBy("this")
class C {
    private String f;

    public synchronized void foo(String s) {
        f = s; // BUG: GUARDEDBY_VIOLATION
    }

    public void showBug() {
        foo("test");
        System.out.println(f);
    }
}

// Unreachable if-else statement mutant
@GuardedBy("this")
class C {
    private String f;

    public synchronized void foo(String s) {
        f = s;
        if (false) {
            // Unreachable code
            f = "mutant";
        } else {
            // Original code
            f = s;
        }
    }

    public void showBug() {
        foo("test");
        System.out.println(f);
    }
}