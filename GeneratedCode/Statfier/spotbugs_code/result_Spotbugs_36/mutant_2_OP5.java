import java.util.Iterator;
import java.util.List;

class Bug3330970 {
  public void go(List list) {
    Iterator i = list.iterator();
    while (i.hasNext()) {
      // do something with the stuff in the list
      
      // Inserting an unreachable switch statement
      boolean alwaysFalse = getAlwaysFalse();
      switch (alwaysFalse) {
        case true:
          // This case is unreachable because alwaysFalse is always false
          System.out.println("This will never be printed");
          break;
        default:
          // Default case is also unreachable due to the same reason
          System.out.println("This will also never be printed");
          break;
      }
    }
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}