import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Bug3393185 implements Serializable {

  private static final long serialVersionUID = 1L;

  private String fileName_;

  @ExpectWarning("SE_BAD_FIELD")
  private Map<String, Thread> tags_;

  @NoWarning("SE_BAD_FIELD")
  private Map<String, String> tags2_;

  @NoWarning("SE_BAD_FIELD")
  private Set<String> events_;

  public Bug3393185(String fileName) {
    fileName_ = fileName;
    tags_ = new HashMap<String, Thread>();
    tags2_ = new HashMap<String, String>();
    events_ = new HashSet<String>();

    // Introduced an unreachable while loop as per the mutation operator
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will always return false
      System.out.println("This is an unreachable loop");
    }
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the loop is unreachable
    return false;
  }
}