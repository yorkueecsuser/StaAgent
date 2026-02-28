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

  // Mutated code
  @NoWarning("OS_OPEN_STREAM")
  @ExpectWarning("OS_OPEN_STREAM_EXCEPTION_PATH")
  public static String md5SumFileMutant(File z)
      throws FileNotFoundException, NoSuchAlgorithmException, IOException {
    FileInputStream a = new FileInputStream(z);
    MessageDigest b = java.security.MessageDigest.getInstance("MD5");
    byte[] c = new byte[1024];

    try {
      int d;
      do {
        /*
         * Try to read a full buffer worth of data
         */
        d = a.read(c, 0, c.length);
        if (d > 0) {
          b.update(c, 0, d);
        }
      } while (d > 0);
    } finally {
      a.close();
    }
    byte[] e = b.digest();
    StringBuilder f = new StringBuilder();
    for (int g = 0; g < e.length; g++) {
      f.append(Integer.toHexString((e[g] >> 4) & 0x0F));
      f.append(Integer.toHexString(e[g] & 0x0F));
    }

    return f.toString();
  }
}