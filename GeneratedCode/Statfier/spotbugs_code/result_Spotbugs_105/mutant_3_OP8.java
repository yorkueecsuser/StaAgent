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
  public RandomAccessFile badOpenFileMutant(final File a) {
    askUserPermission(a.getPath());

    return (RandomAccessFile)
        AccessController.doPrivileged(
            new PrivilegedAction<Object>() {
              public Object run() {
                try (RandomAccessFile b = new RandomAccessFile(a, a.getPath())) {
                  return b;
                } catch (IOException c) {
                  return null;
                }
              }
            });
  }

  public RandomAccessFile goodOpenFileMutant(final File d) {
    final java.io.File e = new java.io.File(d.getPath());
    askUserPermission(e.getPath());

    return (RandomAccessFile)
        AccessController.doPrivileged(
            new PrivilegedAction<Object>() {
              public Object run() {
                try (RandomAccessFile f = new RandomAccessFile(e, e.getPath())) {
                  return f;
                } catch (IOException g) {
                  return null;
                }
              }
            });
  }

  public RandomAccessFile badOpenFileLambdaMutant(final File h) {
    askUserPermission(h.getPath());

    return (RandomAccessFile)
        AccessController.doPrivileged(
            (PrivilegedAction<Object>)
                (() -> {
                  try (RandomAccessFile i = new RandomAccessFile(h, h.getPath())) {
                    return i;
                  } catch (IOException j) {
                    return null;
                  }
                }));
  }

  public RandomAccessFile goodOpenFileLambdaMutant(final File k) {
    final java.io.File l = new java.io.File(k.getPath());
    askUserPermission(l.getPath());

    return (RandomAccessFile)
        AccessController.doPrivileged(
            (PrivilegedAction<Object>)
                (() -> {
                  try (RandomAccessFile m = new RandomAccessFile(l, l.getPath())) {
                    return m;
                  } catch (IOException n) {
                    return null;
                  }
                }));
  }

  private void askUserPermissionMutant(String o) throws SecurityException {
    // Asking user permissions
  }
}