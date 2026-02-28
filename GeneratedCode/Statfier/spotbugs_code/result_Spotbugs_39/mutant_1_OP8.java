import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class Ideas_2009_05_20 {
  @NoWarning("NP_")
  public static void falsePositive_ifnonull(List lst) {
    final ArrayList sections = new ArrayList();
    for (Object o : lst) {
      if (sections!= null) sections.add(o);
    }
    sections.clear();

    // Mutant
    final ArrayList x = new ArrayList();
    for (Object y : lst) {
      if (x!= null) x.add(y);
    }
    x.clear();
  }

  @NoWarning("NP_")
  public static void falsePositive_ifnonnull(Object o) {
    final ArrayList sections = new ArrayList();
    if (sections!= null) sections.add(o);

    sections.clear();

    // Mutant
    final ArrayList a = new ArrayList();
    if (a!= null) a.add(o);

    a.clear();
  }

  @NoWarning("NP_")
  public static void falsePositive(List lst) {
    final ArrayList sections = new ArrayList();
    for (Object o : lst) {
      if (null!= sections) sections.add(o);
    }
    sections.clear();

    // Mutant
    final ArrayList b = new ArrayList();
    for (Object c : lst) {
      if (null!= b) b.add(c);
    }
    b.clear();
  }

  @NoWarning("NP_")
  public static void falsePositive(Object o) {
    final ArrayList sections = new ArrayList();
    if (null!= sections) sections.add(o);

    sections.clear();

    // Mutant
    final ArrayList d = new ArrayList();
    if (null!= d) d.add(o);

    d.clear();
  }

  /**
   * From Ant 1.5.2, org.apache.tools.ant.taskdefs.optional.extension.Specification
   *
   * <p>Reported as a FindBugs false positive in "Accurate Interprocedural Null-Dereference Analysis
   * for Java", Mangala Gowri Nanda and Saurabh Sinha, ICSE 2009
   */
  @NoWarning("NP_")
  static ArrayList<Ideas_2009_05_20> removeDuplicates_FalsePositive(
      final ArrayList<Ideas_2009_05_20> list) {
    final ArrayList<Ideas_2009_05_20> results = new ArrayList<Ideas_2009_05_20>();
    final ArrayList<String> sections = new ArrayList<String>();
    while (list.size() > 0) {
      final Ideas_2009_05_20 specification = list.remove(0);
      final Iterator<Ideas_2009_05_20> iterator = list.iterator();
      while (iterator.hasNext()) {
        final Ideas_2009_05_20 other = iterator.next();
        if (specification.equals(other)) {
          final String[] otherSections = other.getSections();
          if (null!= sections) {
            sections.addAll(Arrays.asList(otherSections));
          }
          iterator.remove();
        }
      }

      final Ideas_2009_05_20 merged = mergeInSections(specification, sections);
      results.add(merged);
      // Reset list of sections
      sections.clear();
    }

    return results;

    // Mutant
    final ArrayList<Ideas_2009_05_20> r = new ArrayList<Ideas_2009_05_20>();
    final ArrayList<String> s = new ArrayList<String>();
    while (list.size() > 0) {
      final Ideas_2009_05_20 spec = list.remove(0);
      final Iterator<Ideas_2009_05_20> it = list.iterator();
      while (it.hasNext()) {
        final Ideas_2009_05_20 oth = it.next();
        if (spec.equals(oth)) {
          final String[] os = oth.getSections();
          if (null!= s) {
            s.addAll(Arrays.asList(os));
          }
          it.remove();
        }
      }

      final Ideas_2009_05_20 m = mergeInSections(spec, s);
      r.add(m);
      // Reset list of sections
      s.clear();
    }

    return r;
  }

  private static Ideas_2009_05_20 mergeInSections(
      Ideas_2009_05_20 specification, ArrayList<String> sections) {
    return specification;
  }

  private String[] getSections() {
    return new String[] {"a"};
  }
}