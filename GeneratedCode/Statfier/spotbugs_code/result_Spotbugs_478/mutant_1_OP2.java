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
          String text1_duplicate = usageDataColumnProvider.get(event1); // Duplicate assignment
          String text2 = usageDataColumnProvider.get(event2);
          String text2_duplicate = usageDataColumnProvider.get(event2); // Duplicate assignment

          if (text1 == null && text2 == null) return 0;
          if (text1 == null) return -1;
          if (text2 == null) return 1;

          return text1.compareTo(text2);
        }
      };
}