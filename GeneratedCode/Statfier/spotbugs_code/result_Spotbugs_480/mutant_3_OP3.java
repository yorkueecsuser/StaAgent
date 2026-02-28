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
          
          // Mutant code: Inserting an unreachable if statement
          boolean condition = getCondition();
          if (condition) {
            // This block is unreachable because getCondition() will never return true
            add("unreachableText");
          }
        }
        
        private boolean getCondition() {
          // This method always returns false, making the if block unreachable
          return false;
        }
      };
}