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

    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
      System.out.println("This is an unreachable loop");
    }

    if (xField.isAnnotationPresent(RuntimeVisible.class)) {
      System.out.println("x");
    }
    if (yField.isAnnotationPresent(NotRuntimeVisible.class)) {
      System.out.println("y");
    }
  }

  // Method to provide a dynamic condition that evaluates to false
  private static boolean getCondition() {
    return false;
  }
}