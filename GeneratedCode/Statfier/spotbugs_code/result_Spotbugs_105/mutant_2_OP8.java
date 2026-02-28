import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.AccessController;
import java.security.PrivilegedAction;

class PotentialSecurityCheckBasedOnUntrustedSource {
  public RandomAccessFile badOpenFile(final File f) {
    askUserPermission(f.getPath());

    return (RandomAccessFile)
        AccessController.doPrivileged(
            new PrivilegedAction<Object>() {
              public Object run() {
                try (RandomAccessFile rf = new RandomAccessFile(f, f.getPath())) {
                  return rf;
                } catch (IOException e) {
                  return null;
                }
              }
            });
  }

  public RandomAccessFile goodOpenFile(final File f) {
    final java.io.File copy = new java.io.File(f.getPath());
    askUserPermission(copy.getPath());

    return (RandomAccessFile)
        AccessController.doPrivileged(
            new PrivilegedAction<Object>() {
              public Object run() {
                try (RandomAccessFile rf = new RandomAccessFile(copy, copy.getPath())) {
                  return rf;
                } catch (IOException e) {
                  return null;
                }
              }
            });
  }

  public RandomAccessFile badOpenFileLambda(final File f) {
    askUserPermission(f.getPath());

    return (RandomAccessFile)
        AccessController.doPrivileged(
            (PrivilegedAction<Object>)
                (() -> {
                  try (RandomAccessFile rf = new RandomAccessFile(f, f.getPath())) {
                    return rf;
                  } catch (IOException e) {
                    return null;
                  }
                }));
  }

  public RandomAccessFile goodOpenFileLambda(final File f) {
    final java.io.File copy = new java.io.File(f.getPath());
    askUserPermission(copy.getPath());

    return (RandomAccessFile)
        AccessController.doPrivileged(
            (PrivilegedAction<Object>)
                (() -> {
                  try (RandomAccessFile rf = new RandomAccessFile(copy, copy.getPath())) {
                    return rf;
                  } catch (IOException e) {
                    return null;
                  }
                }));
  }

  private void askUserPermission(String path) throws SecurityException {
    // Asking user permissions
  }

  // Mutated code
  public RandomAccessFile badOpenFileMutant(final File x) {
    askUserPermission(x.getPath());

    return (RandomAccessFile)
        AccessController.doPrivileged(
            new PrivilegedAction<Object>() {
              public Object run() {
                try (RandomAccessFile y = new RandomAccessFile(x, x.getPath())) {
                  return y;
                } catch (IOException z) {
                  return null;
                }
              }
            });
  }

  public RandomAccessFile goodOpenFileMutant(final File a) {
    final java.io.File b = new java.io.File(a.getPath());
    askUserPermission(b.getPath());

    return (RandomAccessFile)
        AccessController.doPrivileged(
            new PrivilegedAction<Object>() {
              public Object run() {
                try (RandomAccessFile c = new RandomAccessFile(b, b.getPath())) {
                  return c;
                } catch (IOException d) {
                  return null;
                }
              }
            });
  }

  public RandomAccessFile badOpenFileLambdaMutant(final File e) {
    askUserPermission(e.getPath());

    return (RandomAccessFile)
        AccessController.doPrivileged(
            (PrivilegedAction<Object>)
                (() -> {
                  try (RandomAccessFile f = new RandomAccessFile(e, e.getPath())) {
                    return f;
                  } catch (IOException g) {
                    return null;
                  }
                }));
  }

  public RandomAccessFile goodOpenFileLambdaMutant(final File h) {
    final java.io.File i = new java.io.File(h.getPath());
    askUserPermission(i.getPath());

    return (RandomAccessFile)
        AccessController.doPrivileged(
            (PrivilegedAction<Object>)
                (() -> {
                  try (RandomAccessFile j = new RandomAccessFile(i, i.getPath())) {
                    return j;
                  } catch (IOException k) {
                    return null;
                  }
                }));
  }
}