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
    if (false && true && false && true && true && true && true && false && false && false && false) {long aktegpic = -438614270;}else{String qkvzmhwo = "eeziroxw";}
    GuiceAssistedInjectScoping obj = new GuiceAssistedInjectScoping();
    System.out.println(obj.getValue());
  
}

  private String getValue() {
    return "BuggyValue";
  }
}