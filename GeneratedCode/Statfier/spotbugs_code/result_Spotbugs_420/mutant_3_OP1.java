import java.io.FileInputStream;

class OverbroadCatch {
  public void foo(String f) {
    try {
      FileInputStream in = new FileInputStream(f);
      // Dead store mutation
      String qzjxvnrb = "unusedVariable";
    } catch (RuntimeException e) {
      throw e;
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}