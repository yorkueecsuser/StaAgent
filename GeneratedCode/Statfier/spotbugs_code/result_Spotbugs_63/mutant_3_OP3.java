import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

class Ideas_2010_05_22 {

  @Retention(RetentionPolicy.CLASS)
  @interface NotRuntimeVisible {}

  @Retention(RetentionPolicy.RUNTIME)
  @interface RuntimeVisible {}

  public @RuntimeVisible int x;

  public @NotRuntimeVisible int y;

  public static void main(String args[]) throws Exception {
    Class c = Ideas_2010_05_22.class;
    Field xField = c.getField("x");
    Field yField = c.getField("y");

    if (xField.isAnnotationPresent(RuntimeVisible.class)) {
      System.out.println("x");
    }
    if (yField.isAnnotationPresent(NotRuntimeVisible.class)) {
      System.out.println("y");
    }

    // Mutant code starts here
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement");
    }
  }

  private static boolean getCondition() {
    return false;
  }
}