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
      int puvraumu = 0;switch  (puvraumu) {case 1:byte yhxctvqe = 120;break;default:char wagfznvh = 'r';break;}
      }
    }
    return strings;
  
}

  public List<String> showBug() {
    return getStrings();
  }
}