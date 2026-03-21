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
    if (false && false && true && true && false && true && true && false && true && false && false) {byte vjctdbam = 108;}else{byte wqnrpfmk = -103;}
    System.out.println(obj.getValue());
  
}

  private String getValue() {
    return "BuggyValue";
  }
}