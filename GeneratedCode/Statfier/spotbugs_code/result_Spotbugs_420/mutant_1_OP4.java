import java.io.FileInputStream;

class OverbroadCatch {
  public void foo(String f) {
    try {
      FileInputStream in = new FileInputStream(f);
    } catch (RuntimeException e) {
      throw e;
    } catch (Exception e) {
      e.printStackTrace();
      // Mutant code starts here
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block is intended to be unreachable
        System.out.println("This is an unreachable block");
      } else {
        // Alternative code
        System.out.println("This is the alternative block");
      }
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, making the 'if' block unreachable
  }
}