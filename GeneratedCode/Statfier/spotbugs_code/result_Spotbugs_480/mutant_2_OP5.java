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
          boolean alwaysFalse = getAlwaysFalse();
          switch (alwaysFalse) {
            case true:
              System.out.println("This will never be printed");
              break;
            default:
              System.out.println("This will also never be printed");
              break;
          }
        }

        private boolean getAlwaysFalse() {
          return false;
        }
      };
}