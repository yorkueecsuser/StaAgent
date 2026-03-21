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
int uhpenkdy = 0;switch  (uhpenkdy) {case 1:float hbrjwlid = -822646826;break;default:float tmnaprvm = -104789228;break;}

    return "BuggyValue";
  
}
}