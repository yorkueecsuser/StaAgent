import java.lang.reflect.Field;
import java.util.Iterator;

class MyClassWithFields {
  int x;
  int y;
}

class IteratorTest {

  public void appendTo(Iterator<?> parts) {
    do {
      if (!parts.hasNext()) break;
      System.out.println(parts.next());
    } while (true);
  }

  public void linearIterable(Iterable<?> elements) {
    appendTo(elements.iterator());
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
    Iterator<Color> iterator = Color.values().iterator();
    do {
      if (!iterator.hasNext()) break;
      Color c = iterator.next();
    } while (true);
  }

  public void fields_iter() {
    Field[] fields = MyClassWithFields.class.getFields();
    int i = 0;
    do {
      if (i >= fields.length) break;
      Field f = fields[i];
      i++;
    } while (true);
  }
}