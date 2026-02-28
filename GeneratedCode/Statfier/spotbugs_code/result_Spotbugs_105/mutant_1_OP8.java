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
                try (RandomAccessFile q = new RandomAccessFile(x, x.getPath())) {
                  return q;
                } catch (IOException e) {
                  return null;
                }
              }
            });
  }

  public RandomAccessFile goodOpenFileMutant(final File y) {
    final java.io.File z = new java.io.File(y.getPath());
    askUserPermission(z.getPath());

    return (RandomAccessFile)
        AccessController.doPrivileged(
            new PrivilegedAction<Object>() {
              public Object run() {
                try (RandomAccessFile w = new RandomAccessFile(z, z.getPath())) {
                  return w;
                } catch (IOException e) {
                  return null;
                }
              }
            });
  }

  public RandomAccessFile badOpenFileLambdaMutant(final File a) {
    askUserPermission(a.getPath());

    return (RandomAccessFile)
        AccessController.doPrivileged(
            (PrivilegedAction<Object>)
                (() -> {
                  try (RandomAccessFile b = new RandomAccessFile(a, a.getPath())) {
                    return b;
                  } catch (IOException e) {
                    return null;
                  }
                }));
  }

  public RandomAccessFile goodOpenFileLambdaMutant(final File c) {
    final java.io.File d = new java.io.File(c.getPath());
    askUserPermission(d.getPath());

    return (RandomAccessFile)
        AccessController.doPrivileged(
            (PrivilegedAction<Object>)
                (() -> {
                  try (RandomAccessFile e = new RandomAccessFile(d, d.getPath())) {
                    return e;
                  } catch (IOException e) {
                    return null;
                  }
                }));
  }
}