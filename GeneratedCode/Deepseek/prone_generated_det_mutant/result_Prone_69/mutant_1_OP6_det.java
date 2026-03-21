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
for  (int qwvytawd = 0; qwvytawd < 0; qwvytawd++) {long zqroephh = -83318282;}

    return field1;
  
}
}