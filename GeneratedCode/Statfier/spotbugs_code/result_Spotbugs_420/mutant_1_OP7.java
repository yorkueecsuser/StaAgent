import java.io.FileInputStream;

class OverbroadCatch {
  public void foo(String f) {
    try {
      FileInputStream in = new FileInputStream(f);
      // Introduced an unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable because getCondition() always returns false
      }
    } catch (RuntimeException e) {
      throw e;
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the while loop unreachable
    return false;
  }
}