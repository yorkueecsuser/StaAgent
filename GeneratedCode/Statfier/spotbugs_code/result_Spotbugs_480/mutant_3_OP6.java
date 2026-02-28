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
          
          // Unreachable for loop mutant
          boolean conditionFor = getCondition();
          for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() returns false
          }
        }
        
        private boolean getCondition() {
          return false;
        }
      };
}