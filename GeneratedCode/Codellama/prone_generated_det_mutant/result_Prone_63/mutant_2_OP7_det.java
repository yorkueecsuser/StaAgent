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
boolean bqrhysuo = false;while (bqrhysuo && true && true && true && false && true && false && true && true && true && true && false) {int cpsueyjq = 1028369;}

    return "BuggyValue";
  
}
}