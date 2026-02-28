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
      final InputStream z = new FileInputStream(srcFile);

      /** Won't be closed if the call to z.close() throws an exception */
      final OutputStream y = new FileOutputStream(dtFile);
      try {
        final byte[] b = new byte[1024];
        int l;
        while ((l = z.read(b)) > 0) {
          y.write(b, 0, l);
        }
      } finally {
        z.close();
        y.close();
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
        final OutputStream w = new FileOutputStream(dtFile);

        try {
          final byte[] c = new byte[1024];
          int m;
          while ((m = x.read(c)) > 0) {
            w.write(c, 0, m);
          }
        } finally {
          w.close();
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