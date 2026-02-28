import java.util.ArrayList;

/**
 * @see <a href="https://github.com/spotbugs/spotbugs/issues/1759">GitHub issue</a>
 */
class Issue1759 {
  ArrayList<Integer> lst = new ArrayList<Integer>();
  Integer[] res;

  public Integer[] asArray() {
    res = (Integer[]) ((Object[]) (lst.toArray())); // should report a warning here
    return this.res;
  }

  // Mutated code
  ArrayList<Integer> kst = new ArrayList<Integer>();
  Integer[] qes;

  public Integer[] bsArray() {
    qes = (Integer[]) ((Object[]) (kst.toArray())); // should report a warning here
    return this.qes;
  }
}