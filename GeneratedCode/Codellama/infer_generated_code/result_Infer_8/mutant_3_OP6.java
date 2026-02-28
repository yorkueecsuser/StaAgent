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

/* Mutated code for Unreachable for loop mutation operator */
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

    public void unreachableForLoopMutation() {
        int i = 0; // Non-final variable to avoid compile-time constant error
        for (; i < 100; i++) { // Loop condition is always false, making it unreachable
            // Do nothing
        }
    }
}

/* Mutated code for Unreachable if statement mutation operator */
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

    public void unreachableIfStatementMutation() {
        boolean condition = false; // Non-final variable to avoid compile-time constant error
        if (condition) {
            // Do nothing
        } else {
            // Do nothing
        }
    }
}

/* Mutated code for Unreachable while loop mutation operator */
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

    public void unreachableWhileLoopMutation() {
        boolean condition = false; // Non-final variable to avoid compile-time constant error
        while (condition) {
            // Do nothing
        }
    }
}

/* Mutated code for Unreachable switch statement mutation operator */
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

    public void unreachableSwitchStatementMutation() {
        int value = 0; // Non-final variable to avoid compile-time constant error
        switch (value) {
            case 1: // Do nothing
                break;
            default: // Do nothing
                break;
        }
    }
}