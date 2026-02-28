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

            // Introduced unreachable if-else statement
            boolean shouldRun = getCondition();
            if (shouldRun) {
              // This block is unreachable because getCondition() always returns false
              System.out.println("This is an unreachable block");
            } else {
              // This block will always execute
              System.out.println("This is the reachable block");
            }

            return a.compareTo(b);
          }

          private boolean getCondition() {
            // Always return false to ensure the if block is unreachable
            return false;
          }
        };

    java.util.Arrays.sort(aDateMgr, c);
  }
}