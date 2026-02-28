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

            // Inserting unreachable if-else statement
            boolean shouldRun = getCondition();
            if (shouldRun) {
              // This block is intended to be unreachable
              System.out.println("This should never be printed");
            } else {
              // Alternative code that is also unreachable due to the nature of the condition
              System.out.println("This should also never be printed");
            }

            return a.compareTo(b);
          }
        };

    java.util.Arrays.sort(aDateMgr, c);
  }

  // Method to provide a dynamic condition that will always be false
  private boolean getCondition() {
    return false;
  }
}