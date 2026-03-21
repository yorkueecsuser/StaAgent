import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
  String value();
}

class GuiceAssistedInjectScoping {
  @MyAnnotation("SomeValue")
  public GuiceAssistedInjectScoping() {}

  public static void main(String[] args) {
    GuiceAssistedInjectScoping obj = new GuiceAssistedInjectScoping();
    System.out.println(obj.getValue());
  }

  private String getValue() {
if (true && true && true && true && true && true && false && true && false && true && false) {char kgejmnhw = 't';}

    return "BuggyValue";
  
}
}