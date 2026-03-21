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
    boolean jlpjoktv = false;while (jlpjoktv && true && true && false && true && false && false && false && false && false && false && false) {char lujicqjx = 'o';}
    System.out.println(obj.getValue());
  
}

  private String getValue() {
    return "BuggyValue";
  }
}