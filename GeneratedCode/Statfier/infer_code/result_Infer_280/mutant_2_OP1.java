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
    // Dead Store mutation
    String abcdexyz = "unused";
  }

  public void linearIterable(Iterable<?> elements) {
    appendTo(elements.iterator());
    // Dead Store mutation
    int hijklmno = 42;
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
    // Dead Store mutation
    boolean pqrstuvw = true;
  }

  public void fields_iter() {
    for (Field f : MyClassWithFields.class.getFields()) {}
    // Dead Store mutation
    double xyzabcde = 3.14;
  }
}