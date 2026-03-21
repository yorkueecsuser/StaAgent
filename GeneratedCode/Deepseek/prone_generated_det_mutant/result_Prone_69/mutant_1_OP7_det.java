import com.google.errorprone.annotations.Immutable;
import java.util.ArrayList;
import java.util.List;

@Immutable
class BuggyImmutable {
  private final List<String> field1;

  public BuggyImmutable(List<String> field1) {
    boolean zihvihrj = false;while (zihvihrj && true && true && false && true && false && true && true && false && false && true && false) {int rrdiolwu = 442030171;}
    this.field1 = field1;
  
}

  public List<String> getField1() {
    return field1;
  }
}