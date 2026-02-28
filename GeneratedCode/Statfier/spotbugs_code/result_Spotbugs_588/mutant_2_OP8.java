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
    return obj;
  }

  // Mutated version of getCollectionAsArray
  public Object[] getCollectionAsArraya(Collection a) {
    List b = null;
    Iterator j = a.iterator();
    if (j.hasNext()) {
      b = new LinkedList();
    }
    while (j.hasNext()) {
      b.add(j.next());
    }
    Object[] k = b.toArray(); // guaranteed dereference here
    return k;
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
    return obj;
  }

  // Mutated version of addCollectionToListDoNotReport
  public Object[] addCollectionToListDoNotReportb(Collection d, List e) {
    if (e == null) System.out.println("Values shouldn't be null");
    Iterator f = d.iterator();
    if (f.hasNext()) {
      e = new LinkedList();
    }
    while (f.hasNext()) {
      e.add(f.next());
    }
    Object[] g = e.toArray(); // guaranteed dereference here
    return g;
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
    return result;
  }

  // Mutated version of variation
  public int variationa(Object z, int w) {
    int h = 2;
    if (w >= 0) {
      if (z == null) h = 1;
      if (w > 0) h *= w;
    } else z = new Object();
    h += z.hashCode();
    return h;
  }
}