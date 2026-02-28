import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class JXPathMetaModuleExample {

  // A null pointer error very similar to this was reported in
  // http://issues.apache.org/bugzilla/show_bug.cgi?id=28646

  // TODO: generate a NPE warning for this bug
  public Object[] getCollectionAsArray(Collection c) {
    List values = null;
    Iterator i = c.iterator();
    if (i.hasNext()) {
      values = new LinkedList();
    }
    while (i.hasNext()) {
      values.add(i.next());
    }
    Object[] obj = values.toArray(); // guaranteed dereference here

    // Inserting unreachable switch statement
    boolean unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition? 0 : 1) {
      case 0:
        // This case is unreachable
        values.add("unreachable");
        break;
    }

    return obj;
  }

  // A variation, in which the NPE only occurs if value == null
  // and!i.hasNext(). So don't report it.
  public Object[] addCollectionToListDoNotReport(Collection c, List values) {
    if (values == null) System.out.println("Values shouldn't be null");
    Iterator i = c.iterator();
    if (i.hasNext()) {
      values = new LinkedList();
    }
    while (i.hasNext()) {
      values.add(i.next());
    }
    Object[] obj = values.toArray(); // guaranteed dereference here

    // Inserting unreachable switch statement
    boolean unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition? 0 : 1) {
      case 0:
        // This case is unreachable
        values.add("unreachable");
        break;
    }

    return obj;
  }

  // A variation,which we should report.
  // if the test x == null succeeds, we are guaranteed to dereference the
  // value in x
  // But at the merge point after the if y >= 0, x is NCP.
  // So if we don't track GuaranteedDereference backwards across
  // value number mergers, we won't detect this one
  public int variation(Object x, int y) {
    int result = 2;
    if (y >= 0) {
      if (x == null) result = 1;
      if (y > 0) result *= y;
    } else x = new Object();
    result += x.hashCode();

    // Inserting unreachable switch statement
    boolean unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition? 0 : 1) {
      case 0:
        // This case is unreachable
        result += 100;
        break;
    }

    return result;
  }

  // Method to provide a dynamic condition for unreachable code
  private boolean getUnreachableCondition() {
    return true; // This will always evaluate to true, making the switch case 0 unreachable
  }
}