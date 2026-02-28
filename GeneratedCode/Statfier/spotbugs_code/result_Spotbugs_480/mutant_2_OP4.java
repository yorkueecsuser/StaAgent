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
          
          // Introduced unreachable if-else statement
          boolean shouldRun = getCondition();
          if (shouldRun) {
            // This block will never execute because shouldRun is always false
            add("unreachableText1");
          } else {
            // This block will also never execute because shouldRun is always false
            add("unreachableText2");
          }
        }
        
        private boolean getCondition() {
          return false; // This method ensures the condition is dynamically determined at runtime but always returns false
        }
      };
}