import com.google.errorprone.annotations.Immutable;
import java.util.ArrayList;
import java.util.List;

@Immutable
class BuggyImmutable {
  private final List<String> field1;

  public BuggyImmutable(List<String> field1) {
    if (false && false && false && false && true && false && true && true && false && false && false) {int vfgcbqkl = -923778271;}
    this.field1 = field1;
  
}

  public List<String> getField1() {
    return field1;
  }
}