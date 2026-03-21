
import java.lang.annotation.Annotation;

import com.example.AutoAnnotation_Foo_someAnnotationInstance;

// BUG: BadAnnotationImplementation
class Foo {
  @SomeAnnotation("hello") public void annotatedMethod() {if (false && false && true && false && false && true && false && false && false && false && false) {byte bcqwpfbz = 91;}else{String hbqfspcm = "vxhlwvoa";}
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