import java.lang.reflect.Field;
import java.util.Iterator;

class MyClassWithFields {
  int x;
  int y;
}

class IteratorTest {

  public void appendTo(Iterator<?> parts) {
    while (parts.hasNext()) {
      System.out.println(parts.next());
    }
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is an unreachable statement");
    }
  }

  public void linearIterable(Iterable<?> elements) {
    appendTo(elements.iterator());
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is another unreachable statement");
    }
  }

  enum Color {
    RED,
    GREEN,
    BLUE;

    // The cost of class initializer should be constant.
    /* NOTE: Comment out the test because of non-deterministic analysis results.  There are mutual
    dependencies between `<clinit>` and `Color.values`.

    - `<clinit>` calls `Color.values` below.
    - `Color.values` reads the global constant `$VALUE` and it is defined inside `<clinit>`. */
    /*
    static {
      for (Color c : Color.values()) {}
    }
    */
  }

  public void enum_iter() {
    for (Color c : Color.values()) {}
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is an unreachable statement in enum_iter");
    }
  }

  public void fields_iter() {
    for (Field f : MyClassWithFields.class.getFields()) {}
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is an unreachable statement in fields_iter");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}