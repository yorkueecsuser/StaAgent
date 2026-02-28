import com.facebook.infer.annotation.Expensive;
import java.lang.annotation.*;

/**
 * Marker annotation used for static analysis.
 */
@Retention(RetentionPolicy.CLASS)
@Target({
    ElementType.TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.PARAMETER
})
@interface YourAnnotationName {}

interface I {  void foo();}
class A implements I {  
  @Expensive
  public void foo() {}

  public void showBug() {
    foo(); // BUG: CHECKERS_EXPENSIVE_OVERRIDES_UNANNOTATED
    // Mutation Operator - Unreachable while loop
    // The while loop condition is always false making it unreachable
    boolean condition = false;
    while(condition) {
      // This code will never execute
      System.out.println("This is a mutant code");
    }
  }
}