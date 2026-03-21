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
    int qehkhppl = 0;switch  (qehkhppl) {case 1:int hpwhrcov = 659533609;break;default:char zyqpjflg = 'm';break;}
    foo(); // BUG: CHECKERS_EXPENSIVE_OVERRIDES_UNANNOTATED
  
}
}