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

// Mutant 1: Replace for loop with do-while loop
class C1 {
    private String f;

    public synchronized void foo(String s) {
        f = s; // BUG: GUARDEDBY_VIOLATION
    }

    public void showBug() {
        do {
            foo("test");
            System.out.println(f);
        } while (false);
    }
}

// Mutant 2: Replace while loop with do-while loop
class C2 {
    private String f;

    public synchronized void foo(String s) {
        f = s; // BUG: GUARDEDBY_VIOLATION
    }

    public void showBug() {
        do {
            foo("test");
            System.out.println(f);
        } while (false);
    }
}

// Mutant 3: Replace for loop with do-while loop
class C3 {
    private String f;

    public synchronized void foo(String s) {
        f = s; // BUG: GUARDEDBY_VIOLATION
    }

    public void showBug() {
        do {
            foo("test");
            System.out.println(f);
        } while (false);
    }
}