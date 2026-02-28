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
      final InputStream a = new FileInputStream(srcFile);

      /** Won't be closed if the call to a.close() throws an exception */
      final OutputStream b = new FileOutputStream(dtFile);
      try {
        final byte[] c = new byte[1024];
        int d;
        while ((d = a.read(c)) > 0) {
          b.write(c, 0, d);
        }
      } finally {
        a.close();
        b.close();
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
      final InputStream e = new FileInputStream(srcFile);
      try {
        final OutputStream f = new FileOutputStream(dtFile);

        try {
          final byte[] g = new byte[1024];
          int h;
          while ((h = e.read(g)) > 0) {
            f.write(g, 0, h);
          }
        } finally {
          f.close();
        }
      } finally {
        e.close();
      }
    } catch (final FileNotFoundException ex) {
      return false;
    } catch (final IOException e) {
      return false;
    }
    return true;
  }
}