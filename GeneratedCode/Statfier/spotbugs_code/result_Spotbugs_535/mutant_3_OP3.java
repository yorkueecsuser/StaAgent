import javax.annotation.Nullable;

class Bug1965452b {

  static int foo(@Nullable Object x) {
    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable statement");
    }
    
    return x.hashCode();
  }

  // Method to provide a dynamic but always false condition
  private static boolean getCondition() {
    return false;
  }
}