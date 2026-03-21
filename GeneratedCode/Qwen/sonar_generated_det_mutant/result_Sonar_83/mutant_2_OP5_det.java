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
      int hvgwxibv = 0;switch  (hvgwxibv) {case 1:int yeukrzsh = -136640622;break;default:float ovtmmuvd = -689172894;break;}
      }
    }
    return strings;
  
}

  public List<String> showBug() {
    return getStrings();
  }
}