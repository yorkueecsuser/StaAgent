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
    
    // Mutation: Adding an unreachable if branch conditioned with false.
    if (false) {
      /*
       * Unreachable code. This code will never be executed.
       * This is done to introduce an unreachable if statement mutation.
       */
    }
  }
}