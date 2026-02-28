import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class Bug3460960 {

  @NoWarning("OS_OPEN_STREAM")
  @ExpectWarning("OS_OPEN_STREAM_EXCEPTION_PATH")
  public static String md5SumFile(File f)
      throws FileNotFoundException, NoSuchAlgorithmException, IOException {
    FileInputStream input = new FileInputStream(f);
    MessageDigest digest = java.security.MessageDigest.getInstance("MD5");
    byte[] buffer = new byte[1024];

    try {
      int numRead;
      do {
        /*
         * Try to read a full buffer worth of data
         */
        numRead = input.read(buffer, 0, buffer.length);
        if (numRead > 0) {
          digest.update(buffer, 0, numRead);
        }
        
        // Inserting unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // This block should never be executed
          System.out.println("This is an unreachable block");
        } else {
          // Alternative block that will always be executed
          System.out.println("This block is always executed");
        }
      } while (numRead > 0);
    } finally {
      input.close();
    }
    byte[] hash = digest.digest();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < hash.length; i++) {
      sb.append(Integer.toHexString((hash[i] >> 4) & 0x0F));
      sb.append(Integer.toHexString(hash[i] & 0x0F));
    }

    return sb.toString();
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This ensures the if block is unreachable
  }
}