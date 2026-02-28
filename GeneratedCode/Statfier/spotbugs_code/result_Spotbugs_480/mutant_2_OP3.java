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
          
          // Introduced unreachable if statement
          boolean condition = getCondition();
          if (condition) {
            // This block is unreachable because getCondition() always returns false
            add("unreachableText");
          }
        }
        
        // Method to provide a dynamic condition that is always false
        private boolean getCondition() {
          return false;
        }
      };
}