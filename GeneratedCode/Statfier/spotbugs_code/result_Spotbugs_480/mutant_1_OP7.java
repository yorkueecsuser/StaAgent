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
          
          // Introduced unreachable while loop as per mutation operator
          boolean conditionWhile = getCondition();
          while (conditionWhile) {
            // This loop is unreachable because getCondition() will return false
          }
        }

        private boolean getCondition() {
          return false;
        }
      };
}