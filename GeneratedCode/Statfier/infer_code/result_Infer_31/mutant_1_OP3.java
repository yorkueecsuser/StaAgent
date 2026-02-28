import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation tells the thread-safety analysis to assume that mutations in the annotated
 * class/field/method are confined to the given thread name. For the thread name, you can either use
 * the default constants UI/ANY or add your own.
 */
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
public @interface ThreadConfined {
  /** the thread that the mutations should be confined to */
  String value();
  /** confined to the UI thread */
  public static String UI = "UI";
  /** confined to any thread (but only that thread!) */
  public static String ANY = "ANY";

  // Introduced mutant: Unreachable if statement
  boolean getCondition() {
    return false; // This method will always return false, but it's not a compile-time constant
  }

  default void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement due to the condition always being false.");
    }
  }
}