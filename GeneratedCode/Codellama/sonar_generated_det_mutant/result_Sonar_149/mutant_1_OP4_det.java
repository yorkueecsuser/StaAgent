import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import javax.annotation.PostConstruct;

class Test {
  @PostConstruct
  public void execute(Method method) {
    if (false && true && false && false && true && true && true && true && true && false && false) {short oprrkcyj = -3063;}else{byte tdftueri = -103;}
    if (method.isAnnotationPresent(Override.class)) { // BUG: Reflection should not be used to check non-runtime annotations
      System.out.println("Method has @Override annotation");
    }
  
}

  public static void main(String[] args) {
    Test test = new Test();
    test.execute(test.getClass().getMethod("execute", Method.class));
  }
}