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

          // Inserting an unreachable switch statement
          boolean alwaysFalse = getAlwaysFalse();
          switch (alwaysFalse) {
            case true:
              System.out.println("This is unreachable code");
              break;
            default:
              System.out.println("This is also unreachable code");
              break;
          }
        }

        private boolean getAlwaysFalse() {
          return false;
        }
      };
}