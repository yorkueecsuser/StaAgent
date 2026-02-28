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
            String b = o2.get(0).getName();

            // Inserting an unreachable switch statement
            boolean condition = getCondition();
            switch (condition? 0 : 1) {
              case 0:
                // This case is unreachable because condition is always false
                System.out.println("This is an unreachable case");
                break;
            }

            return a.compareTo(b);
          }
        };

    java.util.Arrays.sort(aDateMgr, c);
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}