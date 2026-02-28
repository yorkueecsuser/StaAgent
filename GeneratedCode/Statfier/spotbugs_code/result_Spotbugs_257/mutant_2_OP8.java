import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

class Ideas_2011_12_18 {

  @SuppressFBWarnings("IL_INFINITE_RECURSIVE_LOOP")
  @NoWarning("IL_INFINITE_RECURSIVE_LOOP")
  int loop() {
    return loop();
  }

  // Mutant 1: Renamed 'loop' to 'a'
  @SuppressFBWarnings("IL_INFINITE_RECURSIVE_LOOP")
  @NoWarning("IL_INFINITE_RECURSIVE_LOOP")
  int a() {
    return a();
  }

  @ExpectWarning("IL_INFINITE_RECURSIVE_LOOP")
  int loop2() {
    return loop2();
  }

  // Mutant 2: Renamed 'loop2' to 'b'
  @ExpectWarning("IL_INFINITE_RECURSIVE_LOOP")
  int b() {
    return b();
  }

  @edu.umd.cs.findbugs.annotations.SuppressFBWarnings("IL_INFINITE_RECURSIVE_LOOP")
  @NoWarning("IL_INFINITE_RECURSIVE_LOOP")
  int loop3() {
    return loop3();
  }

  // Mutant 3: Renamed 'loop3' to 'c'
  @edu.umd.cs.findbugs.annotations.SuppressFBWarnings("IL_INFINITE_RECURSIVE_LOOP")
  @NoWarning("IL_INFINITE_RECURSIVE_LOOP")
  int c() {
    return c();
  }
}