import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class CloseStream {
  public static void writeFile(File f, Object o) throws IOException {

    OutputStream out = new FileOutputStream(f);
    int i = o.hashCode();
    
    // Introduced an unreachable for loop as per the mutation operator
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
        // This loop is unreachable because conditionFor is always false
    }

    out.close();
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
      return false;
  }
}