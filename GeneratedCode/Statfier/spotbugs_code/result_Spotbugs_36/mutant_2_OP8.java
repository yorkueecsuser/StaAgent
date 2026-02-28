import java.util.Iterator;
import java.util.List;

class Bug3330970 {
  public void go(List list) {
    Iterator i = list.iterator();
    while (i.hasNext()) {
      // do something with the stuff in the list
    }

    // Mutated code
    Iterator j = list.iterator();
    while (j.hasNext()) {
      // do something with the stuff in the list
    }
  }
}