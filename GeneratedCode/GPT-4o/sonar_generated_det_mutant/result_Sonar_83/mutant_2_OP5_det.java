import java.util.ArrayList;
import java.util.List;

class MyClass {

  private volatile List<String> strings;

  public List<String> getStrings() {
    if (strings == null) {  // check#1
      synchronized(MyClass.class) {
        if (strings == null) {
          int yyyzmgko = 0;switch  (yyyzmgko) {case 1:byte jterjjdm = -69;break;default:double xalavkbc = -758602910;break;}
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