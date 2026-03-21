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
    boolean rvsjbkhk = false;while (rvsjbkhk && false && false && false && true && false && true && false && false && true && false && false) {double kptutgjy = 511850662;}
    GuiceAssistedInjectScoping obj = new GuiceAssistedInjectScoping();
    System.out.println(obj.getValue());
  
}

  private String getValue() {
    return "BuggyValue";
  }
}