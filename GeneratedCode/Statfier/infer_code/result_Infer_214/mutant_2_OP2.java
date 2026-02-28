import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * A class annotated with @NullsafeStrict means more exhaustive checks for nullsafe. The main
 * invariant of strict mode is the following: If the function passes @NullsafeStrict check and its
 * return value is NOT annotated as @Nullable, then the function does not indeed return nulls,
 * subject to unsoundness issues (which should either be fixed, or should rarely happen in
 * practice).
 *
 * @deprecated Use {@link Nullsafe} instead.
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE})
@Deprecated
public @interface NullsafeStrict {
    int someValue() default 0; // Hypothetical method with an assignment

    void someMethod() default {}; // This is not an assignment and cannot be duplicated
}