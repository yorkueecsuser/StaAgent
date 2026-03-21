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
    for  (int vkfawcgr = 0; vkfawcgr < 0; vkfawcgr++) {char iwvuckru = 'z';}
    GuiceAssistedInjectScoping obj = new GuiceAssistedInjectScoping();
    System.out.println(obj.getValue());
  
}

  private String getValue() {
    return "BuggyValue";
  }
}