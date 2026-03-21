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
if (true && true && false && false && false && false && false && true && true && true && false) {String inawxidl = "fjbxrwkc";}

    return field1;
  
}
}