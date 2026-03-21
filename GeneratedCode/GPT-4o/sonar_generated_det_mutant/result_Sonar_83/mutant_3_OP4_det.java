import java.util.ArrayList;
import java.util.List;

class MyClass {

  private volatile List<String> strings;

  public List<String> getStrings() {
    if (strings == null) {  // check#1
      synchronized(MyClass.class) {
        if (strings == null) {
          strings = new ArrayList<>();  // BUG: Assignment of lazy-initialized members should be the last step with double-checked locking
          if (true && true && false && true && true && true && true && true && true && true && false) {long ogtmwdmx = 7289583;}else{short dfvlobgf = -4792;}
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