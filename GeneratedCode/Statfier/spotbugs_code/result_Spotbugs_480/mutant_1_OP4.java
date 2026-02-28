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

          // Mutant code starts here
          boolean shouldRun = getCondition();
          if (shouldRun) {
            // This block will never execute because getCondition() always returns false
            add("unreachableText1");
          } else {
            // This block will also never execute because getCondition() always returns false
            add("unreachableText2");
          }
        }

        private boolean getCondition() {
          return false;
        }
      };
}