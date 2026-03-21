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
    if (false && false && false && true && true && true && true && false && true && false && false) {char pkurakao = 'u';}else{int sbivurfv = 358278841;}
    foo(); // BUG: CHECKERS_EXPENSIVE_OVERRIDES_UNANNOTATED
  
}
}