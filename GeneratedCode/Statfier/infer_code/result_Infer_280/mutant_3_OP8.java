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
    // Mutant: Renaming 'parts' to 'a'
    Iterator<?> a = parts;
    while (a.hasNext()) {
      System.out.println(a.next());
    }
  }

  public void linearIterable(Iterable<?> elements) {
    appendTo(elements.iterator());
    // Mutant: Renaming 'elements' to 'b'
    Iterable<?> b = elements;
    appendTo(b.iterator());
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
    // Mutant: Renaming 'c' to 'd'
    for (Color d : Color.values()) {}
  }

  public void fields_iter() {
    for (Field f : MyClassWithFields.class.getFields()) {}
    // Mutant: Renaming 'f' to 'g'
    for (Field g : MyClassWithFields.class.getFields()) {}
  }
}