import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.channels.FileChannel;

class OpenStream {
  public OutputStream os;

  @ExpectWarning("OBL_UNSATISFIED_OBLIGATION,OS_OPEN_STREAM")
  int simpleObviousBug(String f) throws IOException {
    FileInputStream in = new FileInputStream(f);
    return in.read();
  }

  public static void main(String[] argv) throws Exception {
    FileInputStream a = null;

    try {
      a = new FileInputStream(argv[0]);
    } finally {
      // Not guaranteed to be closed here!
      if (Boolean.getBoolean("inscrutable")) a.close();
    }

    FileInputStream in2 = null;
    try {
      in2 = new FileInputStream(argv[1]);
    } finally {
      // This one will be closed
      if (in2!= null) in2.close();
    }

    // oops! exiting the method without closing the stream
  }

  @NoWarning("OBL_UNSATISFIED_OBLIGATION,OS_OPEN_STREAM")
  public void byteArrayStreamDoNotReport() {
    ByteArrayOutputStream b = new ByteArrayOutputStream();
    PrintStream c = new PrintStream(b);

    c.println("Hello, world!");
  }

  @NoWarning("OBL_UNSATISFIED_OBLIGATION,OS_OPEN_STREAM")
  public void systemInDoNotReport() throws IOException {
    BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
    System.out.println(d.readLine());
  }

  @NoWarning("OBL_UNSATISFIED_OBLIGATION,OS_OPEN_STREAM")
  public void socketDoNotReport(java.net.Socket e) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(e.getInputStream()));
    System.out.println(f.readLine());
  }

  @NoWarning("OBL_UNSATISFIED_OBLIGATION,OS_OPEN_STREAM")
  public void paramStreamDoNotReport(java.io.OutputStream g) throws IOException {
    PrintStream h = new PrintStream(g);
    h.println("Hello");
  }

  @NoWarning("OBL_UNSATISFIED_OBLIGATION,OS_OPEN_STREAM")
  public void loadFromFieldDoNotReport() throws IOException {
    OutputStream i = os;
    PrintStream j = new PrintStream(i);
    j.println("Hello");
  }

  @NoWarning("OBL_UNSATISFIED_OBLIGATION")
  @DesireNoWarning("OS_OPEN_STREAM")
  public void wrappedStreamClosedDoNotReport() throws IOException {
    FileOutputStream k = null;
    try {
      k = new FileOutputStream("Hello.txt");
      PrintStream l = new PrintStream(k);
      l.println("Hello");
    } finally {
      if (k!= null) k.close();
    }
  }

  @NoWarning("OBL_UNSATISFIED_OBLIGATION,OS_OPEN_STREAM")
  public static FileChannel createChannelDoNotReport(String m) throws IOException {
    FileInputStream n = new FileInputStream(m);
    FileChannel o = n.getChannel();
    return o; // stream escapes via FileChannel
  }

  public static long sizeViaChannel(String p) throws IOException {
    FileInputStream q = new FileInputStream(p);
    FileChannel r = q.getChannel();
    return r.size(); // nothing escapes, probably should report
  }

  @NoWarning("OBL_UNSATISFIED_OBLIGATION,OS_OPEN_STREAM")
  public static long sizeViaChannelCloseDoNotReport(String s) throws IOException {
    FileInputStream t = new FileInputStream(s);
    FileChannel u = t.getChannel();
    long v = u.size();
    // t.close();
    u.close();
    return v;
  }
}

// vim:ts=4