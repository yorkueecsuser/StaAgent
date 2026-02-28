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

// Unreachable switch statement mutant
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

    public void unreachableSwitch(String s) {
        int value = getValue();
        switch (value) {
            case 1:
                System.out.println("Reachable");
                break;
            case 2:
                System.out.println("Reachable");
                break;
            default:
                System.out.println("Default");
                break;
        }
    }

    private int getValue() {
        return 0;
    }
}