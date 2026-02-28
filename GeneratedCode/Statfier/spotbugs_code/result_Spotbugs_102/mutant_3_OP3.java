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

            // Inserting an unreachable if statement
            boolean condition = getUnreachableCondition();
            if (condition) {
              // This block is unreachable
              System.out.println("This is an unreachable block");
            }

            return a.compareTo(b);
          }

          private boolean getUnreachableCondition() {
            // This method always returns false, making the if statement unreachable
            return false;
          }
        };

    java.util.Arrays.sort(aDateMgr, c);
  }
}