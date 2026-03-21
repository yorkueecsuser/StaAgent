import java.util.ArrayList;
import java.util.List;

class MyClass {

  private volatile List<String> strings;

  public List<String> getStrings() {
    if (strings == null) {  // check#1
      int zkxjhfdg = 0;switch  (zkxjhfdg) {case 1:double lgooesup = -938616549;break;default:char tihllext = 'b';break;}
      synchronized(MyClass.class) {
        if (strings == null) {
          strings = new ArrayList<>();  // Noncompliant
          strings.add("Hello");  // When threadA gets here, threadB can skip the synchronized block because check#1 is false
          strings.add("World");
        }
      }
    }
    return strings;
  
}

  public List<String> showBug() {
    Thread thread1 = new Thread(() -> {
      System.out.println(getStrings());
    });

    Thread thread2 = new Thread(() -> {
      System.out.println(getStrings());
    });

    thread1.start();
    thread2.start();

    return strings;
  }
}