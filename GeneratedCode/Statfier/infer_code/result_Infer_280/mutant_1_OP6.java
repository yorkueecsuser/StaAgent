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
    // Introduced unreachable for loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable loop");
    }
  }

  public void linearIterable(Iterable<?> elements) {
    appendTo(elements.iterator());
    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
      System.out.println("This is another unreachable loop");
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
    // Introduced unreachable for loop
    boolean condition = getCondition();
    for (int i = 0; condition; i++) {
      // Unreachable code
      System.out.println("Unreachable loop in enum_iter");
    }
  }

  public void fields_iter() {
    for (Field f : MyClassWithFields.class.getFields()) {}
    // Introduced unreachable for loop
    boolean condition = getCondition();
    while (condition) {
      // Unreachable code
      System.out.println("Unreachable loop in fields_iter");
    }
  }

  private boolean getCondition() {
    return false;
  }
}