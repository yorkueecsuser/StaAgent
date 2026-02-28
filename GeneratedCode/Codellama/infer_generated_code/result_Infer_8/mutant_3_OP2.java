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
// Mutation operator: Duplication
// Mutation description: Duplicating a randomly selected assignment statement and insert immediately after its current location. To avoid side effect, the applicable assignment statement is limited to the ones without using method invocation
// Core requirements:
// 1. Generated mutated Java code MUST maintain the original code (the original code must be left in place, do not remove from it only add code to it).
// 2. Generated mutated Java code MUST maintain the original bug in the code. DO NOT remove or fix the bug.
// 3. Mutant code being added MUST be unique not generic.
// 4. Generated mutated Java code MUST maintain all original import and package statements to ensure successful compilation.
// 5. Generated mutated Java code MUST avoid unreachable statement error.

// Mutated Java code:
@GuardedBy("this")
class C {
    private String f;

    public synchronized void foo(String s) {
        f = s; // BUG: GUARDEDBY_VIOLATION
        f = s; // Mutant code: Duplicate assignment statement
    }

    public void showBug() {
        foo("test");
        System.out.println(f);
    }
}