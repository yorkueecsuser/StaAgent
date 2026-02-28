import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.ArrayList;
import java.util.List;

class Bug3529616 {
  @NoWarning(value = "SE_BAD_FIELD_INNER_CLASS", confidence = Confidence.MEDIUM)
  private List<String> myList =
      new ArrayList<String>() {
        {
          add("text1");
          add("text2");

          // Introduced unreachable switch statement
          boolean condition = getCondition();
          switch (condition? 0 : 1) {
            case 0:
              System.out.println("This will never be printed");
              break;
            case 1:
              // This is the only reachable case
              break;
          }
        }

        private boolean getCondition() {
          return false;
        }
      };
}