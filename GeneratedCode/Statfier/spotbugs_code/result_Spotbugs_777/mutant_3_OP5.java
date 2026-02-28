import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class CloseStream {
  public static void writeFile(File f, Object o) throws IOException {

    OutputStream out = new FileOutputStream(f);
    int i = o.hashCode();
    
    // Introduced an unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        System.out.println("This is an unreachable case.");
        break;
      default:
        System.out.println("This is also unreachable.");
        break;
    }

    out.close();
  }

  private static boolean getAlwaysFalse() {
    return false;
  }
}