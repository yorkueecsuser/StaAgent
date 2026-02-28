import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.Comparator;
import java.util.List;

class Bug1487961 {
  static class DateMgr {
    String getName() {
      return "a";
    }
  }

  void sort(List<DateMgr>[] aDateMgr) {
    Comparator<List<DateMgr>> c =
        new Comparator<List<DateMgr>>() {
          @Override
          @NoWarning("UMAC")
          public int compare(List<DateMgr> o1, List<DateMgr> o2) {
            String a = o1.get(0).getName();
            String a_duplicate = o1.get(0).getName(); // Duplicate assignment
            String b = o2.get(0).getName();
            String b_duplicate = o2.get(0).getName(); // Duplicate assignment

            return a.compareTo(b);
          }
        };

    java.util.Arrays.sort(aDateMgr, c);
  }
}