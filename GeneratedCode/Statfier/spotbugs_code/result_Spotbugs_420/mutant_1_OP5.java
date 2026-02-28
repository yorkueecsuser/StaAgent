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

    // Introduced unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        System.out.println("This is unreachable code.");
        break;
      default:
        // Do nothing
        break;
    }
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}