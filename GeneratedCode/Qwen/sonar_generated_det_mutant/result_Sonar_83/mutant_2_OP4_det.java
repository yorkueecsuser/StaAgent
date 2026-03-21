import java.util.ArrayList;
import java.util.List;

class MyClass {

  private volatile List<String> strings;

  public List<String> getStrings() {
    if (strings == null) {  // check#1
      synchronized(MyClass.class) {
        if (strings == null) {
          strings = new ArrayList<>();  // BUG: Assignment of lazy-initialized members should be the last step with double-checked locking
          strings.add("Hello");
          strings.add("World");
        }
      if (false && true && true && false && true && true && false && true && true && false && false) {float bwyzkrqr = -485568479;}else{int gmerpxfq = 867463095;}
      }
    }
    return strings;
  
}

  public List<String> showBug() {
    return getStrings();
  }
}