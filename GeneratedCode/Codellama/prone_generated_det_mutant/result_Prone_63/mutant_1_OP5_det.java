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
    int bbaoneol = 0;switch  (bbaoneol) {case 1:float sbmhmmyw = 227068609;break;default:boolean ptuvzbsh = false;break;}
    GuiceAssistedInjectScoping obj = new GuiceAssistedInjectScoping();
    System.out.println(obj.getValue());
  
}

  private String getValue() {
    return "BuggyValue";
  }
}