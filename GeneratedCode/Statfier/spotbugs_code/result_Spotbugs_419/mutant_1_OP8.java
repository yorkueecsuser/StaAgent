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
    FileInputStream in = null;

    try {
      in = new FileInputStream(argv[0]);
    } finally {
      // Not guaranteed to be closed here!
      if (Boolean.getBoolean("inscrutable")) in.close();
    }

    FileInputStream x = null;
    try {
      x = new FileInputStream(argv[1]);
    } finally {
      // This one will be closed
      if (x!= null) x.close();
    }

    // oops! exiting the method without closing the stream
  }

  @NoWarning("OBL_UNSATISFIED_OBLIGATION,OS_OPEN_STREAM")
  public void byteArrayStreamDoNotReport() {
    ByteArrayOutputStream b = new ByteArrayOutputStream();
    PrintStream y = new PrintStream(b);

    y.println("Hello, world!");
  }

  @NoWarning("OBL_UNSATISFIED_OBLIGATION,OS_OPEN_STREAM")
  public void systemInDoNotReport() throws IOException {
    BufferedReader z = new BufferedReader(new InputStreamReader(System.in));
    System.out.println(z.readLine());
  }

  @NoWarning("OBL_UNSATISFIED_OBLIGATION,OS_OPEN_STREAM")
  public void socketDoNotReport(java.net.Socket socket) throws IOException {
    BufferedReader w = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    System.out.println(w.readLine());
  }

  @NoWarning("OBL_UNSATISFIED_OBLIGATION,OS_OPEN_STREAM")
  public void paramStreamDoNotReport(java.io.OutputStream os) throws IOException {
    PrintStream v = new PrintStream(os);
    v.println("Hello");
  }

  @NoWarning("OBL_UNSATISFIED_OBLIGATION,OS_OPEN_STREAM")
  public void loadFromFieldDoNotReport() throws IOException {
    OutputStream outputStream = os;
    PrintStream u = new PrintStream(outputStream);
    u.println("Hello");
  }

  @NoWarning("OBL_UNSATISFIED_OBLIGATION")
  @DesireNoWarning("OS_OPEN_STREAM")
  public void wrappedStreamClosedDoNotReport() throws IOException {
    FileOutputStream f = null;
    try {
      f = new FileOutputStream("Hello.txt");
      PrintStream t = new PrintStream(f);
      t.println("Hello");
    } finally {
      if (f!= null) f.close();
    }
  }

  @NoWarning("OBL_UNSATISFIED_OBLIGATION,OS_OPEN_STREAM")
  public static FileChannel createChannelDoNotReport(String fname) throws IOException {
    FileInputStream s = new FileInputStream(fname);
    FileChannel ch = s.getChannel();
    return ch; // stream escapes via FileChannel
  }

  public static long sizeViaChannel(String fname) throws IOException {
    FileInputStream r = new FileInputStream(fname);
    FileChannel ch = r.getChannel();
    return ch.size(); // nothing escapes, probably should report
  }

  @NoWarning("OBL_UNSATISFIED_OBLIGATION,OS_OPEN_STREAM")
  public static long sizeViaChannelCloseDoNotReport(String fname) throws IOException {
    FileInputStream q = new FileInputStream(fname);
    FileChannel ch = q.getChannel();
    long sz = ch.size();
    // q.close();
    ch.close();
    return sz;
  }
}

// vim:ts=4