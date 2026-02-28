import java.io.FileInputStream;

class OverbroadCatch {
  public void foo(String f) {
    try {
      FileInputStream in = new FileInputStream(f);
    } catch (RuntimeException e) {
      throw e;
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    // Mutant code
    try {
      FileInputStream x = new FileInputStream(f);
    } catch (RuntimeException a) {
      throw a;
    } catch (Exception b) {
      b.printStackTrace();
    }
  }
}