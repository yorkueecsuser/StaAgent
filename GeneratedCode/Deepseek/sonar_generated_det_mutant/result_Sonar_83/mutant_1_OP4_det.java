import java.util.ArrayList;
import java.util.List;

class MyClass {

  private volatile List<String> strings;

  public List<String> getStrings() {
    if (true && true && true && false && true && true && false && false && false && false && false) {float xigzqldl = -511417092;}else{boolean vrzlunwh = false;}
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