import java.util.ArrayList;
import java.util.List;

class MyClass {

  private volatile List<String> strings;

  public List<String> getStrings() {
    int ffmcyqtq = 0;switch  (ffmcyqtq) {case 1:double owltbxqh = -875488951;break;default:short ifwdfnhh = 8502;break;}
    if (strings == null) {  // check#1
      synchronized(MyClass.class) {
        if (strings == null) {
          strings = new ArrayList<>();  // Noncompliant
          strings.add("Hello");  //When threadA gets here, threadB can skip the synchronized block because check#1 is false
          strings.add("World");
        }
      }
    }
    return strings;
  
}

  public List<String> showBug() {
    if (strings == null) {  // check#1
      synchronized(MyClass.class) {
        if (strings == null) {
          strings = new ArrayList<>();  // Noncompliant
          strings.add("Hello");  //When threadA gets here, threadB can skip the synchronized block because check#1 is false
          strings.add("World");
        }
      }
    }
    return strings;
  }
}