import com.google.errorprone.annotations.Immutable;
import java.util.ArrayList;
import java.util.List;

@Immutable
class BuggyImmutable {
  private final List<String> field1;

  public BuggyImmutable(List<String> field1) {
    for  (int fmsmkebg = 0; fmsmkebg < 0; fmsmkebg++) {boolean jhvqrcls = false;}
    this.field1 = field1;
  
}

  public List<String> getField1() {
    return field1;
  }
}