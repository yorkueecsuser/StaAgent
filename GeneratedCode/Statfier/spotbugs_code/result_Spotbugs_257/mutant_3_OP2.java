import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

class Ideas_2011_12_18 {

  @SuppressFBWarnings("IL_INFINITE_RECURSIVE_LOOP")
  @NoWarning("IL_INFINITE_RECURSIVE_LOOP")
  int loop() {
    return loop(); // Original recursive call
    return loop(); // Duplicated recursive call
  }

  @ExpectWarning("IL_INFINITE_RECURSIVE_LOOP")
  int loop2() {
    return loop2(); // Original recursive call
    return loop2(); // Duplicated recursive call
  }

  @edu.umd.cs.findbugs.annotations.SuppressFBWarnings("IL_INFINITE_RECURSIVE_LOOP")
  @NoWarning("IL_INFINITE_RECURSIVE_LOOP")
  int loop3() {
    return loop3(); // Original recursive call
    return loop3(); // Duplicated recursive call
  }
}