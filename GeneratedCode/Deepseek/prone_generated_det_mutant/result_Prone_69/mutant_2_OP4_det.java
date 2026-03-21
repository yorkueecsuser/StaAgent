import com.google.errorprone.annotations.Immutable;
import java.util.ArrayList;
import java.util.List;

@Immutable
class BuggyImmutable {
  private final List<String> field1;

  public BuggyImmutable(List<String> field1) {
    this.field1 = field1;
  }

  public List<String> getField1() {
if (true && true && true && true && false && true && false && true && false && true && false) {short dahjaiwi = -5254;}else{String svkajlvj = "vbrgsgtu";}

    return field1;
  
}
}