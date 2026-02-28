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

    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }

    if (xField.isAnnotationPresent(RuntimeVisible.class)) {
      System.out.println("x");
    }
    if (yField.isAnnotationPresent(NotRuntimeVisible.class)) {
      System.out.println("y");
    }
  }

  // Method to return a condition that will always be false
  private static boolean getCondition() {
    return false;
  }
}