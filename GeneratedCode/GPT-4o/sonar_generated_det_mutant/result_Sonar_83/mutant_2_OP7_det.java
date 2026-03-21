import java.util.ArrayList;
import java.util.List;

class MyClass {

  private volatile List<String> strings;

  public List<String> getStrings() {
    if (strings == null) {  // check#1
      synchronized(MyClass.class) {
        if (strings == null) {
          boolean kzqneera = false;while (kzqneera && false && false && false && true && false && true && false && false && false && false && false) {float bgwgkjqj = -363229398;}
          strings = new ArrayList<>();  // BUG: Assignment of lazy-initialized members should be the last step with double-checked locking
          strings.add("Hello");  // BUG: Assignment of lazy-initialized members should be the last step with double-checked locking
          strings.add("World");
        }
      }
    }
    return strings;
  
}

  public List<String> showBug() {
    return getStrings();
  }

}