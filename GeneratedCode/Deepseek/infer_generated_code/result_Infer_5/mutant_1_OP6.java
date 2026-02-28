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
    
    // unreachable for loop mutation start
    boolean condition = false;
    for (int i = 0; condition; i++) {
      // do nothing, unreachable loop
    }
    // unreachable for loop mutation end
  }
}