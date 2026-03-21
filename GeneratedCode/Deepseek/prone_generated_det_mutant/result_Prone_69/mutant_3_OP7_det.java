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
boolean aqvowooa = false;while (aqvowooa && true && true && false && false && false && false && false && false && false && true && false) {int lwbbddml = 325804690;}

    return field1;
  
}
}