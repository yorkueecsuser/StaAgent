import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class CloseStream {
  public static void writeFile(File f, Object o) throws IOException {

    OutputStream out = new FileOutputStream(f);
    int i = o.hashCode();
    
    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is an unreachable case.");
        break;
      default:
        // Default case will execute
        System.out.println("This is the default case.");
        break;
    }

    out.close();
  }

  private static boolean getCondition() {
    // This method always returns false, making the switch condition always evaluate to 1
    return false;
  }
}