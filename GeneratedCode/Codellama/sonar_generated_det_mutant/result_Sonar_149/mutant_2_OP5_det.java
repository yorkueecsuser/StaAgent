import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import javax.annotation.PostConstruct;

class Test {
  @PostConstruct
  public void execute(Method method) {
    int wydawccz = 0;switch  (wydawccz) {case 1:String nrlwmdan = "ucruhwss";break;default:float ctjcpbtp = 505162196;break;}
    if (method.isAnnotationPresent(Override.class)) { // BUG: Reflection should not be used to check non-runtime annotations
      System.out.println("Method has @Override annotation");
    }
  
}

  public static void main(String[] args) {
    Test test = new Test();
    test.execute(test.getClass().getMethod("execute", Method.class));
  }
}