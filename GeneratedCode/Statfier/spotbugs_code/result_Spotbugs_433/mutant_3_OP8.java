import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Submitted By: Len Trigg Summary:
 *
 * <p>OS reports failure to close stream when the stream is assigned to a member array.
 *
 * <p>Test case attached that demonstrates the problem (and shows that the OS is not reported upon
 * assignment to non-array member).
 */
class Bug1356076 {
  PrintWriter[] mWriters = new PrintWriter[1];

  PrintWriter mWriter = null;

  @NoWarning("OS")
  public void writeString1(final String s) throws IOException {
    if (mWriters[0] == null) {
      final File ff = File.createTempFile("sfq", ".lst");
      ff.deleteOnExit();
      mWriter = new PrintWriter(new BufferedWriter(new FileWriter(ff)));
      // mWriters[0] = new PrintWriter(new BufferedWriter(new
      // FileWriter(ff)));
    }
    mWriter.println(s);
    // mWriters[0].println(s);
  }

  // FindBugs fails to notice that this nWriters escapes too
  // // grep -A 1 OS_OPEN_STREAM | grep Bug1356076
  @NoWarning("OS")
  public void writeString2(final String s) throws IOException {
    if (mWriters[0] == null) {
      final File ff = File.createTempFile("sfq", ".lst");
      ff.deleteOnExit();
      // mWriter = new PrintWriter(new BufferedWriter(new
      // FileWriter(ff)));
      mWriters[0] = new PrintWriter(new BufferedWriter(new FileWriter(ff)));
    }
    // mWriter.println(s);
    mWriters[0].println(s);
  }

  // Mutant code with renaming
  @NoWarning("OS")
  public void writeString3(final String t) throws IOException {
    if (mWriters[0] == null) {
      final File gg = File.createTempFile("sfq", ".lst");
      gg.deleteOnExit();
      mWriter = new PrintWriter(new BufferedWriter(new FileWriter(gg)));
      // mWriters[0] = new PrintWriter(new BufferedWriter(new
      // FileWriter(gg)));
    }
    mWriter.println(t);
    // mWriters[0].println(t);
  }

  // Another mutant code with renaming
  @NoWarning("OS")
  public void writeString4(final String u) throws IOException {
    if (mWriters[0] == null) {
      final File hh = File.createTempFile("sfq", ".lst");
      hh.deleteOnExit();
      // mWriter = new PrintWriter(new BufferedWriter(new
      // FileWriter(hh)));
      mWriters[0] = new PrintWriter(new BufferedWriter(new FileWriter(hh)));
    }
    // mWriter.println(u);
    mWriters[0].println(u);
  }
}