import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

class UseAnnotations {

  @CheckForNull
  Object f(int x) {
    if (x == 0) return null;
    return x;
  }

  int g(@Nonnull Object x) {
    return 42;
  }

  int foo() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and set to false
    }
    return g(f(12)); // should generate a warning here (but don't)
  }

  int foo2() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and set to false
    }
    return g(null); // should and do generate a warning here
  }

  int foo3(int x) {
    Object y = null;
    if (x > 0) y = "";
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and set to false
    }
    return g(y); // should generate a warning here (but don't)
  }

  int foo4() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and set to false
    }
    return f(12).hashCode(); // should generate a warning here (but don't)
  }

  int bar() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and set to false
    }
    return f(12).hashCode(); // should generate a warning here (but don't)
  }

  int bar2() {
    Object x = null;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and set to false
    }
    return x.hashCode(); // should and do generate a warning here
  }

  int bar3(int x) {
    Object y = null;
    if (x > 0) y = "";
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and set to false
    }
    return y.hashCode(); // should generate a warning here (but don't)
  }

  int bar4(int x) {
    Object y = null;
    if (x > 0) y = "";
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and set to false
    }
    return y.hashCode(); // should generate a warning here (but don't)
  }

  private boolean getCondition() {
    return false; // This method returns false, making the for loops unreachable
  }
}