import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class Bug3438200 {

  interface UsageDataEventWrapper {}

  Map<UsageDataEventWrapper, String> usageDataColumnProvider =
      new HashMap<UsageDataEventWrapper, String>();

  Comparator<UsageDataEventWrapper> comparator =
      new Comparator<UsageDataEventWrapper>() {
        @Override
        public int compare(UsageDataEventWrapper event1, UsageDataEventWrapper event2) {
          if (usageDataColumnProvider == null) return 0;
          String text1 = usageDataColumnProvider.get(event1);
          String text2 = usageDataColumnProvider.get(event2);

          if (text1 == null && text2 == null) return 0;
          if (text1 == null) return -1;
          if (text2 == null) return 1;

          return text1.compareTo(text2);
        }
      };

  // Mutant code with renamed variables
  Comparator<UsageDataEventWrapper> comparatorb =
      new Comparator<UsageDataEventWrapper>() {
        @Override
        public int compare(UsageDataEventWrapper a, UsageDataEventWrapper b) {
          if (usageDataColumnProvider == null) return 0;
          String x = usageDataColumnProvider.get(a);
          String y = usageDataColumnProvider.get(b);

          if (x == null && y == null) return 0;
          if (x == null) return -1;
          if (y == null) return 1;

          return x.compareTo(y);
        }
      };
}