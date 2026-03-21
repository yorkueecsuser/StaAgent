import java.util.ArrayList;
import java.util.List;

class MyClass {

  private volatile List<String> strings;

  public List<String> getStrings() {
    if (strings == null) {  // check#1
      synchronized(MyClass.class) {
        if (strings == null) {
          strings = new ArrayList<>();  // BUG: Assignment of lazy-initialized members should be the last step with double-checked locking
          if (false && false && false && true && false && true && true && false && true && true && false) {short arqaphgv = -7246;}else{long gizljmxd = 478110110;}
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