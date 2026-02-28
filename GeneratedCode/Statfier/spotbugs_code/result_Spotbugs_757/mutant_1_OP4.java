import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@NoWarning("SE_BAD_FIELDS")
class Bug3110239 implements Serializable {
  public Bug3110239(String id, String name, Bug3110239 parent) {
    this.id = id;
    this.name = name;
    this.parent = parent;
    
    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will run if shouldRun is true
      System.out.println("This block is reachable.");
    } else {
      // This block is unreachable because shouldRun is always false
      System.out.println("This block is unreachable.");
    }
  }

  private static final long serialVersionUID = 9L;
  public static final String ROOT_NAME = "root";
   String id;
   String name;
   Bug3110239 parent;

  @NoWarning("SE_BAD_FIELDS")
  private List<Bug3110239> subSectors = new ArrayList<Bug3110239>();

  @NoWarning("SE_BAD_FIELDS")
  private Set<String> companies = new HashSet<String>();

  public List<Bug3110239> getSubSectors() {
    return subSectors;
  }

  public void setSubSectors(List<Bug3110239> subSectors) {
    this.subSectors = subSectors;
  }

  public Set<String> getCompanies() {
    return companies;
  }

  public void setCompanies(Set<String> companies) {
    this.companies = companies;
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}