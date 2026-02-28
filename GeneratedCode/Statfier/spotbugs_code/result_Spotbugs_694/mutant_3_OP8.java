import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

class Ideas_2010_08_26 {

  @ExpectWarning(value = "OBL_UNSATISFIED_OBLIGATION_EXCEPTION_EDGE,OS_OPEN_STREAM_EXCEPTION_PATH")
  public static boolean copyfile(final File srcFile, final File dtFile, final boolean overwrite) {
    if (dtFile.exists() &&!overwrite) {
      return false;
    }
    try {
      /** Won't be closed if the call to new FileOutputStream(dtFile) throws an exception */
      final InputStream in = new FileInputStream(srcFile);

      /** Won't be closed if the call to in.close() throws an exception */
      final OutputStream out = new FileOutputStream(dtFile);
      try {
        final byte[] buf = new byte[1024];
        int len;
        while ((len = in.read(buf)) > 0) {
          out.write(buf, 0, len);
        }
      } finally {
        in.close();
        out.close();
      }
    } catch (final FileNotFoundException ex) {
      return false;
    } catch (final IOException e) {
      return false;
    }
    return true;
  }

  @NoWarning("OBL_UNSATISFIED_OBLIGATION")
  /** Corrected code */
  public static boolean copyfile2(final File srcFile, final File dtFile, final boolean overwrite) {
    if (dtFile.exists() &&!overwrite) {
      return false;
    }
    try {
      final InputStream x = new FileInputStream(srcFile);
      try {
        final OutputStream y = new FileOutputStream(dtFile);

        try {
          final byte[] z = new byte[1024];
          int a;
          while ((a = x.read(z)) > 0) {
            y.write(z, 0, a);
          }
        } finally {
          y.close();
        }
      } finally {
        x.close();
      }
    } catch (final FileNotFoundException ex) {
      return false;
    } catch (final IOException e) {
      return false;
    }
    return true;
  }
}