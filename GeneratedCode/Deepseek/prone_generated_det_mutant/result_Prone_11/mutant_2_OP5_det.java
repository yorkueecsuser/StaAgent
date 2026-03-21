
import java.lang.annotation.Annotation;

import com.example.AutoAnnotation_Foo_someAnnotationInstance;

// BUG: BadAnnotationImplementation
class Foo {
  @SomeAnnotation("hello") public void annotatedMethod() {int pjjqtmvw = 0;switch  (pjjqtmvw) {case 1:byte jyzymluz = -16;break;default:short bqrsauoj = 7960;break;}
}

  @AutoAnnotation
  private static SomeAnnotation someAnnotationInstance(String value) {
    return new AutoAnnotation_Foo_someAnnotationInstance(value);
  }

  static void test() {
    Annotation manual = someAnnotationInstance("hello");
    Annotation fromMethod = Foo.class.getMethod("annotatedMethod").getDeclaredAnnotations()[0];

    manual.equals(fromMethod); // true, hooray!
  }
}