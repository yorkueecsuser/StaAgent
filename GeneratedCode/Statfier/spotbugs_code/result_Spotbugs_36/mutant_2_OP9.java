import java.util.Iterator;
import java.util.List;

class Bug3330970 {
  public void go(List list) {
    Iterator i = list.iterator();
    do {
      if (!i.hasNext()) break;
      // do something with the stuff in the list
    } while (true);
  }
}