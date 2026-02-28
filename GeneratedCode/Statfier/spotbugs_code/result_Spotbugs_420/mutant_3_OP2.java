import java.io.FileInputStream;

class OverbroadCatch {
  public void foo(String f) {
    try {
      FileInputStream in = new FileInputStream(f);
      FileInputStream inCopy = new FileInputStream(f); // Mutant: duplicated assignment statement
    } catch (RuntimeException e) {
      throw e;
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}