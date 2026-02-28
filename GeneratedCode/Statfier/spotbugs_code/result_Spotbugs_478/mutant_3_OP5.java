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

          // Introduced an unreachable switch statement
          boolean condition = getCondition();
          switch (condition? 0 : 1) {
            case 0:
              // This case is unreachable because condition is never true
              text1 = "unreachable";
              break;
            case 1:
              // This is the only reachable case
              break;
          }

          return text1.compareTo(text2);
        }

        private boolean getCondition() {
          // This method always returns false, making the switch statement unreachable
          return false;
        }
      };
}