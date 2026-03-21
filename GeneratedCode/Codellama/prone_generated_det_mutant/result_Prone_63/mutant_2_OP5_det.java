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
int bjfiiwaz = 0;switch  (bjfiiwaz) {case 1:int plmmcdzf = 537651298;break;default:double tguyyvde = -538747398;break;}

    return "BuggyValue";
  
}
}