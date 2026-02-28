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
    fileName_ = fileName; // Mutant: duplicated assignment
    tags_ = new HashMap<String, Thread>();
    tags_ = new HashMap<String, Thread>(); // Mutant: duplicated assignment
    tags2_ = new HashMap<String, String>();
    tags2_ = new HashMap<String, String>(); // Mutant: duplicated assignment
    events_ = new HashSet<String>();
    events_ = new HashSet<String>(); // Mutant: duplicated assignment
  }
}